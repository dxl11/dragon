package com.dragon.springsourcecodestudy.aopStudy.simpleCase;

/**
 * @Description:
 * @Param:
 * @return:
 * @Author: lydms
 * @Date: 2023/12/20
 */
public class HangZhouLandlord implements Landlord {
    @Override
    public void apartmentToRent() {
        System.out.println("杭州房东出租房子");
    }
}
