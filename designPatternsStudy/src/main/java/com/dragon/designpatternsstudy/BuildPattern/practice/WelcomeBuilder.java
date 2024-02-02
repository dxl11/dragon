package com.dragon.designpatternsstudy.BuildPattern.practice;

public class WelcomeBuilder extends Builder{

    public WelcomeBuilder(){
        msg = new WelcomeMessage();
    }

    @Override
    public void buildTitle() {
        msg.setSubject("欢迎标题");
    }

    @Override
    public void buildSubject() {
        msg.setBody("ssss");
    }
}
