package com.dragon.designpatternsstudy.BuildPattern;

public class Client {
    public static void main(String[] args) {
        Builder builder = new WelcomeBuilder();
        Director director = new Director(builder);
        director.construct("ss","dd");
    }
}
