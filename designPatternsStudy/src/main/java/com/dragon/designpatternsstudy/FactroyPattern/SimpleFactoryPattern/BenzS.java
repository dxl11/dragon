package com.dragon.designpatternsstudy.FactroyPattern.SimpleFactoryPattern;

public class BenzS implements BenzCreate{
    public void create() {
        System.out.println("建造奔驰S");
    }
}
