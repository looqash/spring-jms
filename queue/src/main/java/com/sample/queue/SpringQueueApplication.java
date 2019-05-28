package com.sample.queue;

import com.sample.queue.config.JmsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Import(JmsConfig.class)
public class SpringQueueApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringQueueApplication.class, args);
    }
}
