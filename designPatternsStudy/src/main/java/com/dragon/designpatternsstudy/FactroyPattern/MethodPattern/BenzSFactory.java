package com.dragon.designpatternsstudy.FactroyPattern.MethodPattern;

public class BenzSFactory implements BenzFactory {
    public Create create() {
        return new BenS();
    }
}
