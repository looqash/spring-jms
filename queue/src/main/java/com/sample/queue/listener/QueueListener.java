package com.sample.queue.listener;

import com.sample.queue.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueListener {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @JmsListener(destination = "${jms.queue-name}")
    public void receiveMessage(Message message) {
        LOGGER.info("Received message {}", message);
    }

}