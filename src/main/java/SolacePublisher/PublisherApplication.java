/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package SolacePublisher;

import java.util.concurrent.CountDownLatch;
// import java.util.concurrent.TimeUnit;
import java.text.DateFormat;
import java.util.Date;
import java.util.LinkedList;
// import java.util.List;

// import com.solace.services.core.model.SolaceServiceCredentials;
// import com.solace.spring.cloud.core.SolaceServiceCredentialsFactory;
// import com.solacesystems.jcsmp.JCSMPProperties;
// import com.solacesystems.jcsmp.SpringJCSMPFactoryCloudFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import com.solacesystems.jcsmp.BytesXMLMessage;
// import com.solacesystems.jcsmp.ConsumerFlowProperties;
import com.solacesystems.jcsmp.DeliveryMode;
import com.solacesystems.jcsmp.EndpointProperties;
// import com.solacesystems.jcsmp.FlowReceiver;
import com.solacesystems.jcsmp.JCSMPException;
import com.solacesystems.jcsmp.JCSMPFactory;
import com.solacesystems.jcsmp.JCSMPSession;
import com.solacesystems.jcsmp.JCSMPStreamingPublishCorrelatingEventHandler;
// import com.solacesystems.jcsmp.JCSMPStreamingPublishEventHandler;
import com.solacesystems.jcsmp.SpringJCSMPFactory;
import com.solacesystems.jcsmp.TextMessage;
// import com.solacesystems.jcsmp.Topic;
import com.solacesystems.jcsmp.Queue;
// import com.solacesystems.jcsmp.XMLMessageConsumer;
// import com.solacesystems.jcsmp.XMLMessageListener;
import com.solacesystems.jcsmp.XMLMessageProducer;

@SpringBootApplication
@EnableAsync
public class PublisherApplication {

    public static void main(String[] args) {
        SpringApplication.run(PublisherApplication.class, args);
    }

    @Component
    static class Runner implements CommandLineRunner {

        final int count = 160000;
        final CountDownLatch latch = new CountDownLatch(count);

        @Autowired private AsyncPublisherService asyncPublisherService;
        private int thread = 16;

        public void run(String... strings) throws Exception {
            int threadCount = count/thread;
            for (int i=1; i<= thread; i++) {
                asyncPublisherService.executeAsyncTask(i, thread, count, threadCount);

            }
            
        }

    }

}
