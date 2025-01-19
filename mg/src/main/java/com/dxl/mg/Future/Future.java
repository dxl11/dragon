package com.dxl.mg.Future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Future {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<Integer> callable = () -> {
            Thread.sleep(1000);
            return 123;
        };

        //就是对线程任务进行一个包装
        //可以判断是任务是否取消，可以取消任务，可以判断任务是否执行完成，可以获得任务执行结果
        FutureTask<Integer> futureTask = new FutureTask(callable);


        Thread thread = new Thread(futureTask);

        thread.start();

        try {
            Integer result = futureTask.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
