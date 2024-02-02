package com.dragon.designpatternsstudy.BuildPattern.practice;

public class Directer {

    public Builder builder;
    public Directer(Builder builder){
        this.builder = builder;
    }

    public void sss(String to,String from){
        this.builder.buildTo(to);
        this.builder.buildFrom(from);
        this.builder.buildSubject();
        this.builder.buildTitle();
        this.builder.buildDate();
        this.builder.sendMessage();
    }
}
