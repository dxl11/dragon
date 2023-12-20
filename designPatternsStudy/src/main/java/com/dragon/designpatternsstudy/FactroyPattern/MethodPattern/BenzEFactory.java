package com.dragon.designpatternsstudy.FactroyPattern.MethodPattern;

public class BenzEFactory implements BenzFactory {
    public Create create() {
        return new BenzE();
    }
}
