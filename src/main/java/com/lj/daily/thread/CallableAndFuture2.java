package com.lj.daily.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by zhouzhanghe on 2016/9/28.
 */
public class CallableAndFuture2 {

    public static void main(String args[]) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> future = service.submit(new Callable<Integer>() {
            public Integer call() throws Exception {
                return new Random().nextInt(100);
            }
        });

        try {
            Thread.sleep(5000);
            System.out.println(future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
