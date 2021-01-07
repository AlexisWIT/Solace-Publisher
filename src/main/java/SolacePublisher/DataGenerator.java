package SolacePublisher;

import java.util.concurrent.TimeUnit;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;


public class DataGenerator {



    public String getNewData() {

        String raw = "3201db001b020f343630303130373934"+
                    "373131313233000848533138303630359"+
                    "3923601dc004900000072190118106110"+
                    "022035606130e77012c01346404021015"+
                    "022c4401ffffff42c343c34fc363ff5df"+
                    "fffff260b112f04a30312c810079c30f0"+
                    "312ff770029004500840088418d7e";

        String random = ""+(int)Math.random()*10+""+(int)Math.random()*10+""+(int)Math.random()*10+""+(int)Math.random()*10+""+(int)Math.random()*10;


        //return random+","+raw;
        return random;
    }
    
    
}
