package SolacePublisher;

import java.text.DateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;

import com.solacesystems.jcsmp.BytesXMLMessage;
import com.solacesystems.jcsmp.DeliveryMode;
import com.solacesystems.jcsmp.EndpointProperties;
import com.solacesystems.jcsmp.InvalidPropertiesException;
import com.solacesystems.jcsmp.JCSMPException;
import com.solacesystems.jcsmp.JCSMPFactory;
import com.solacesystems.jcsmp.JCSMPSession;
import com.solacesystems.jcsmp.JCSMPStreamingPublishCorrelatingEventHandler;
import com.solacesystems.jcsmp.Queue;
import com.solacesystems.jcsmp.SpringJCSMPFactory;
import com.solacesystems.jcsmp.TextMessage;
import com.solacesystems.jcsmp.XMLMessageProducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import SolacePublisher.PublisherApplication.Runner;

@Service
public class AsyncPublisherService {

    private static final Logger logger = LoggerFactory.getLogger(Runner.class);
    
    // Create topic or queue object locally.
    // private final Topic topic =
    // JCSMPFactory.onlyInstance().createTopic("tutorial/topic");
    // private final Queue queue =
    // JCSMPFactory.onlyInstance().createQueue("queue/tutorial");

    @Autowired
    private SpringJCSMPFactory solaceFactory;

    // Examples of other beans that can be used together to generate a customized
    // SpringJCSMPFactory
    // @Autowired(required=false) private SpringJCSMPFactoryCloudFactory
    // springJCSMPFactoryCloudFactory;
    // @Autowired(required=false) private SolaceServiceCredentials
    // solaceServiceCredentials;
    // @Autowired(required=false) private JCSMPProperties jcsmpProperties;

    // private DemoMessageConsumer msgConsumer = new DemoMessageConsumer();
    // private DemoPublishEventHandler pubEventHandler = new
    // DemoPublishEventHandler();

    /*
    * A correlation structure. This structure is passed back to the publisher
    * callback when the message is acknowledged or rejected.
    */
    class MsgInfo {
        public volatile boolean acked = false;
        public volatile boolean publishedSuccessfully = false;
        public BytesXMLMessage sessionIndependentMessage = null;
        public final long id;

        public MsgInfo(long id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return String.format("Message ID: %d, PubConf: %b, PubSuccessful: %b", id, acked, publishedSuccessfully);
        }

    }

    /*
    * A streaming producer can provide this callback handler to handle
    * acknowledgement events.
    */
    class PubCallback implements JCSMPStreamingPublishCorrelatingEventHandler {

        @Override
        public void handleError(String messageID, JCSMPException cause, long timestamp) {
            
            
        }

        @Override
        public void responseReceived(String messageID) {
            

        }

        @Override
        public void handleErrorEx(Object key, JCSMPException cause, long timestamp) {
            
            if (key instanceof MsgInfo) {
                MsgInfo i = (MsgInfo) key;
                i.acked = true;
                System.out.printf("Message response (REJECTED) received for %s, error was %s \n", i, cause);

            }

            //latch.countDown();

        }

        @Override
        public void responseReceivedEx(Object key) {
            
            if (key instanceof MsgInfo) {
                MsgInfo i = (MsgInfo) key;
                i.acked = true;
                i.publishedSuccessfully = true;
                //System.out.printf("Message response (ACCEPTED) received for %s \n", i);

            }

            //latch.countDown();

        }
    }

    @Async
    public void executeAsyncTask(int index, int threadNum, int totalCount, int threadCount) throws JCSMPException {
        System.out.println("Thread "+index+" has been called to execute");

        final LinkedList<MsgInfo> msgList = new LinkedList<MsgInfo>();
        final DataGenerator dg = new DataGenerator();
        final CountDownLatch threadLatch = new CountDownLatch(threadCount);

        //final String msg = "Hello World ";
        final JCSMPSession session = solaceFactory.createSession();

        session.connect();

        // Set queue permissions to "consume" and access-type to "exclusive" 
        // (The first client to bind receives the messages.)
        final EndpointProperties endpointProps = new EndpointProperties();
        endpointProps.setPermission(EndpointProperties.PERMISSION_CONSUME);
        endpointProps.setAccessType(EndpointProperties.ACCESSTYPE_EXCLUSIVE);

        // Create the queue objecct locally
        final Queue queue = JCSMPFactory.onlyInstance().createQueue("queue/tutorial");

        // Actually provision it, and do not fail if it already exists
        session.provision(queue, endpointProps, JCSMPSession.FLAG_IGNORE_ALREADY_EXISTS);

        // List<SolaceServiceCredentials> solaceServiceCredentialsList;
        // solaceServiceCredentialsList = SolaceServiceCredentialsFactory.getAllFromCloudFoundry();


        /** Correlating event handler */
        //PubCallback pubCallback = new PubCallback();
        final XMLMessageProducer producer = session.getMessageProducer(new PubCallback());

        // Publish-only session is now hooked up and running!
        System.out.printf("Connected. About to send " + threadCount + " messages to queue '%s'...%n", queue.getName());

        for (int i=index; i<= totalCount; i+=threadNum) {
            GPSEvent gpsEvent = new GPSEvent(i+"", i*5+"", i*8+"");
            gpsEvent.setAmbs(dg.getNewData());
            String msg = gpsEvent.toString();
            TextMessage jcsmpMsg = JCSMPFactory.onlyInstance().createMessage(TextMessage.class);
            jcsmpMsg.setDeliveryMode(DeliveryMode.PERSISTENT);
            jcsmpMsg.setText(msg + " " + DateFormat.getDateTimeInstance().format(new Date()));

            // The application will wait and confirm the message is published
            // successfully.
            // In this case, wrap the message in a MsgInfo instance, and
            // use it as a correlation key.
            final MsgInfo msgCorrelationInfo = new MsgInfo(i);
            msgCorrelationInfo.sessionIndependentMessage = jcsmpMsg;
            msgList.add(msgCorrelationInfo);

            jcsmpMsg.setCorrelationKey(msgCorrelationInfo);

            //logger.info("============= Sending " + msg);
            //producer.send(jcsmpMsg, topic);
            producer.send(jcsmpMsg, queue);
        }

        System.out.print("Message sent. Processing replies.");

        try {
            threadLatch.await();
        } catch (InterruptedException e){
            System.out.println("I was awoken while waiting");
        }

        while(msgList.peek() != null) {
            final MsgInfo ackedMsgInfo = msgList.poll();
            System.out.printf("Removing acknowledged message (%s) from application list.\n", ackedMsgInfo);
        }
        
        logger.info("Exiting.");
        session.closeSession();
        
    }
}
