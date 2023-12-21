package com.dragon.springsourcecodestudy.aopStudy.jdkAop;


import com.dragon.springsourcecodestudy.aopStudy.simpleCase.Landlord;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

public final class $Proxy0 extends Proxy implements Landlord {
    private static final Method m3;

    public $Proxy0(InvocationHandler invocationHandler) {
        super(invocationHandler);
    }

    public final void apartmentToRent() {
        try {
            this.h.invoke(this, m3, null);
            return;
        } catch (Error | RuntimeException throwable) {
            throw throwable;
        } catch (Throwable throwable) {
            throw new UndeclaredThrowableException(throwable);
        }
    }

    static {
        try {
            m3 = Class.forName("com.dragon.springsourcecodestudy.aopStudy.simpleCase.Landlord").getMethod("apartmentToRent", new Class[0]);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
