package com.dragon.designpatternsstudy.BuildPattern.practice;

public class Client {
    public static void main(String[] args) {
        Builder builder = new WelcomeBuilder();
        Directer director = new Directer(builder);
        director.sss("ss", "sss");
    }
}
