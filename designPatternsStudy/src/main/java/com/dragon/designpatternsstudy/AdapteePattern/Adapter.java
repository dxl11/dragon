package com.dragon.designpatternsstudy.AdapteePattern;

public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        super.specificRequest();
    }
}
