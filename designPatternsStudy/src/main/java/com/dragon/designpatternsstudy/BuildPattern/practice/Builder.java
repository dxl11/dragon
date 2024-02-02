package com.dragon.designpatternsstudy.BuildPattern.practice;

import java.util.Date;

public abstract class Builder {
    public AutoMessage msg;

    public abstract void buildTitle();

    public abstract void buildSubject();

    public void buildTo(String to) {
        this.msg.setTo(to);
    }

    public void buildFrom(String from) {
        this.msg.setFrom(from);
    }

    public void buildDate() {
        this.msg.setSendDate(new Date());
    }

    public void sendMessage() {
        this.msg.send();
    }
}
