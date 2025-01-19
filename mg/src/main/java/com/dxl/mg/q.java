package com.dxl.mg;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class q {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService threadPool = Executors.newFixedThreadPool(10);

        CountDownLatch countDownLatch = new CountDownLatch(5);

        for (int i = 0; i < 6; i++) {
            threadPool.execute(() -> {
                try {
                    //处理文件的业务操作
                    //......
                } finally {
                    //表示一个文件已经被完成
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        threadPool.shutdown();
        System.out.println("finish");
    }


}
