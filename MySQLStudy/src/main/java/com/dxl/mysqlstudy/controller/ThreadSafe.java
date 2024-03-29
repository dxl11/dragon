package com.dxl.mysqlstudy.controller;

import java.util.Arrays;

public class ThreadSafe {
    private static int index = 0;

    public static void main(String[] args) throws InterruptedException {
        //创建数组
        String[] s = new String[5];
        //创建两个操作
        Runnable runnableA = new Runnable() {
            @Override
            public void run() {
                //同步代码块
                synchronized (s) {
                    s[index] = "hello";
                    index++;
                }
            }
        };

        Runnable runnableB = new Runnable() {
            @Override
            public void run() {
                synchronized (s) {
                    s[index] = "world";
                    index++;
                }
            }
        };

        //创建两个线程对象
        Thread a = new Thread(runnableA, "A");
        Thread b = new Thread(runnableB, "B");

        a.start();
        b.start();

        a.join();
        b.join();

        System.out.println(Arrays.toString(s));


    }
}
