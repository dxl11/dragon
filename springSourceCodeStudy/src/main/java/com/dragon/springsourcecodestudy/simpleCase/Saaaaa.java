package com.dragon.springsourcecodestudy.simpleCase;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class Saaaaa<K, V> {

    public static void main(String[] args) {
        // 步骤一：准备西红柿
        CompletableFuture<String> f1 =
                CompletableFuture.supplyAsync(() -> {
                    System.out.println("洗西红柿");

                    System.out.println("切它");

                    return "切好的西红柿";
                });

        // 步骤二：准备鸡蛋
        CompletableFuture<String> f2 =
                CompletableFuture.supplyAsync(() -> {
                    System.out.println("洗鸡蛋");

                    System.out.println("煎鸡蛋");

                    return "煎好的鸡蛋";
                });
        // 步骤三：炒鸡蛋
        CompletableFuture<String> f3 =
                f1.thenCombine(f2, (__, tf) -> {
                    System.out.println("爆炒");
                    return "西红柿炒鸡蛋";
                });

        // 等待任务 3 执行结果
        System.out.println(f3.join());
    }
}
