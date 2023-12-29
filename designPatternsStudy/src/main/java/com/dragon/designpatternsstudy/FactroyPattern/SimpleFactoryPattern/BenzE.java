package com.dragon.designpatternsstudy.FactroyPattern.SimpleFactoryPattern;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: lydms
 * @Date: 2023/12/18
 */
public class BenzE implements BenzCreate {
    public void create() {
        System.out.println("建造奔驰E");
    }
}
