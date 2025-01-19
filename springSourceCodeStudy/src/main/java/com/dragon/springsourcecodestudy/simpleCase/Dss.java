package com.dragon.springsourcecodestudy.simpleCase;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;


public class Dss {

    public static void main(String[] args) {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = buildThreadPoolTaskExector();
        threadPoolTaskExecutor.execute(()->sayHi("execute"));
        threadPoolTaskExecutor.submit(()->sayHi("submit"));

    }

    private static void sayHi(String name) {
        String printStr = "[thread-name]" + Thread.currentThread().getName();
        System.out.println(printStr);
        throw new RuntimeException(printStr + ",我异常啦！哈哈哈");

    }

    private static ThreadPoolTaskExecutor buildThreadPoolTaskExector() {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setThreadNamePrefix("杜晓龙");
        threadPoolTaskExecutor.setCorePoolSize(5);
        threadPoolTaskExecutor.setMaxPoolSize(10);
        threadPoolTaskExecutor.setQueueCapacity(1000);
        threadPoolTaskExecutor.setKeepAliveSeconds(30);
        threadPoolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;
    }

}
