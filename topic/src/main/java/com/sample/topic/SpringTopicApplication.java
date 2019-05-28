package com.sample.topic;

import com.sample.topic.config.JmsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@Import({JmsConfig.class})
public class SpringTopicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTopicApplication.class, args);
    }
}
