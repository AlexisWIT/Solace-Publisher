package SolacePublisher;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncPublisherService {
    
    @Async
    public void executeAsyncTask(int i) {
        System.out.println("Now processing task "+i);
    }
}
