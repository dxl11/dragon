package com.dragon.springsourcecodestudy.simpleCase;

public class ServiceB {

    public void say() {
        ServiceA serviceA = this.getServiceA();
        System.out.println(
                "this:" + this + ",serviceA" + serviceA
        );
    }

    public ServiceA getServiceA() {
        return null;
    }
}
