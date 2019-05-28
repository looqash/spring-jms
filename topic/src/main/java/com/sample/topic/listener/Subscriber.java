package com.sample.topic.listener;

import com.sample.topic.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class Subscriber {

    private static final String JMS_LISTENER_CONTAINER_FACTORY_TOPIC = "jmsListenerContainerFactoryTopic";

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());


    @JmsListener(destination = "${jms.topic-name}", containerFactory = JMS_LISTENER_CONTAINER_FACTORY_TOPIC)
    public void listeningByFirstSubscriber(Message message) {
        LOGGER.info("Received by first subscriber message '{}'", message);
    }

    @JmsListener(destination = "${jms.topic-name}", containerFactory  = JMS_LISTENER_CONTAINER_FACTORY_TOPIC)
    public void listeningBySecondSubscriber(Message message) {
        LOGGER.info("Received by second subscriber message '{}'", message);
    }
}