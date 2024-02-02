package com.dragon.designpatternsstudy.BuildPattern.practice;

import com.dragon.designpatternsstudy.BuildPattern.GoodbyeMessage;

public class GoodByBuilder extends Builder {

    public GoodByBuilder() {
        msg = new GoodByeMessage();
    }

    @Override
    public void buildTitle() {
        this.msg.setSubject("欢送");
    }

    @Override
    public void buildSubject() {
        this.msg.setBody("哈哈哈");
    }
}
