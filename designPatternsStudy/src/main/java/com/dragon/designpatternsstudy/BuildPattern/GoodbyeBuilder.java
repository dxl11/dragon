package com.dragon.designpatternsstudy.BuildPattern;

public class GoodbyeBuilder extends Builder {

    public GoodbyeBuilder() {
        msg = new GoodbyeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setSubject("欢送标题");
    }

    @Override
    public void buildBody() {
        msg.setBody("欢送内容");
    }
}
