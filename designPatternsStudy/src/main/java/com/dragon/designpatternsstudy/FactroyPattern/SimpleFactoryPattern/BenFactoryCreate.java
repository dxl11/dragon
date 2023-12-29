package com.dragon.designpatternsstudy.FactroyPattern.SimpleFactoryPattern;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: lydms
 * @Date: 2023/12/25
 */
public class BenFactoryCreate {
    public static BenzCreate create(Integer type) {
        switch (type) {
            case 1:
                return new BenzS();
            case 2:
                return new BenzE();
            default:
                break;
        }
        return null;
    }
}
