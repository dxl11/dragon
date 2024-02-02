package com.dragon.designpatternsstudy.DecoratorPattern;

/**
 * @author Administrator
 */
public abstract class Humburger {
    protected String name;

    public String getName() {
        return name;
    }

    public abstract double getPrice();
}
