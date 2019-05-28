package com.sample.topic.model;

import java.io.Serializable;
import java.util.UUID;

public class Message implements Serializable{

    public static final long serialVersionUID =1L;

    private UUID messageID;
    private String messageName;
    private String timestamp;

    public Message() {
    }

    public Message(UUID messageID, String messageName, String timestamp) {
        this.messageID = messageID;
        this.messageName = messageName;
        this.timestamp = timestamp;
    }


    public UUID getMessageID() {
        return messageID;
    }

    public void setMessageID(UUID messageID) {
        this.messageID = messageID;
    }

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageID=" + messageID +
                ", messageName='" + messageName + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
