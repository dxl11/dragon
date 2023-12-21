package com.dragon.springsourcecodestudy.aopStudy.jdkAop;

import com.dragon.springsourcecodestudy.aopStudy.simpleCase.HangZhouLandlord;
import com.dragon.springsourcecodestudy.aopStudy.simpleCase.Landlord;

public class Test {
    public static void main(String[] args) {
        Landlord landlord = new HangZhouLandlord();
        ProxyFactory proxyFactory = new ProxyFactory(landlord);
        Landlord proxyInstance = (Landlord) proxyFactory.getProxyInstance();
        proxyInstance.apartmentToRent();
        System.out.println(proxyInstance.getClass());

        while (true){}
    }
}
