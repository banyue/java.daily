package com.lj.daily.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by zhouzhanghe on 2016/9/28.
 */
public class CallableAndFuture {

    public static void main(String arg[]) {
        Callable<Integer> calls = new Callable<Integer>() {
            public Integer call() throws Exception {
                return new Random().nextInt(100);
            }
        };

        FutureTask<Integer> future = new FutureTask<Integer>(calls);

        new Thread(future).start();

        try {
            Thread.sleep(5000);
            System.out.println(future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
