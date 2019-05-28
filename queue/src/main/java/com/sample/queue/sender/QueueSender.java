package com.sample.queue.sender;

import com.sample.queue.model.Message;
import org.apache.activemq.command.ActiveMQQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;
import java.util.UUID;

@Component
public class QueueSender {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Value("${jms.queue-name}")
    private String queueName;

    @Autowired
    private JmsTemplate jmsTemplate;

    @Scheduled(cron = "0 * * ? * *")
    public void sendMessage(){
        Message message = new Message(UUID.randomUUID(),
                "New message",
                ZonedDateTime.now().toString());

        LOGGER.info("Sending message {}", message);
        jmsTemplate.convertAndSend( new ActiveMQQueue(queueName), message);
    }
}
