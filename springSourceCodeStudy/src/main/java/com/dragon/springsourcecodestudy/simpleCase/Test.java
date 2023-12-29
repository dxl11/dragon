package com.dragon.springsourcecodestudy.simpleCase;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("./lookupmethod.xml");
        System.out.println(context.getBean(ServiceA.class));
        System.out.println(context.getBean(ServiceA.class));

        ServiceB serviceB = context.getBean(ServiceB.class);
        serviceB.say();
        serviceB.say();
    }
}
