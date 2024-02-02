package com.dragon.designpatternsstudy.bridgePattern;

public abstract class AbstactMessage {
    MessageClient messageClient;

    public AbstactMessage(MessageClient messageClient) {
        this.messageClient = messageClient;
    }

    public void sendMessage(String message, String toUser){
        this.messageClient.send(message,toUser);
    }
}
