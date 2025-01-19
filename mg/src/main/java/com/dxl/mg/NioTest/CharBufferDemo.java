package com.dxl.mg.NioTest;

import java.nio.CharBuffer;

public class CharBufferDemo {

    /**
     * 私有化构造函数，防止外部实例化
     */
    private CharBufferDemo() {
    }

    ;


    private static class SingletonHolde {
        private static final CharBufferDemo c = new CharBufferDemo();
    }

    public static CharBufferDemo getInstance() {
        return SingletonHolde.c;
    }

}
