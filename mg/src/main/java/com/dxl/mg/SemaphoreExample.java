package com.dxl.mg;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    //请求得数量
    private static final int threadCount = 550;

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("dd");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        //创建一个固定大小得线程池对象
        ExecutorService threadPool = Executors.newFixedThreadPool(300);
        //初始许可数量
        Semaphore semaphore = new Semaphore(20);

        for (int i = 0; i < threadCount; i++) {
            final int threadnum = i;
            threadPool.execute(() -> {
                try {
                    semaphore.acquire();//获取一个许可
                    test(threadnum);
                    semaphore.release();//释放一个许可
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        threadPool.shutdown();
        System.out.println("finish");
    }

    public static void test(int threadNum) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("threadNum" + threadNum);
        Thread.sleep(1000);
    }
}
