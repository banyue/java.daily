package com.lj.daily.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by zhouzhanghe on 2016/9/28.
 */
public class CallableAndFuture4 {

    public static void main(String args[]) {
        ExecutorService service = Executors.newSingleThreadExecutor();  //Executors.newCachedThreadPool()
        List<Future<Integer>> futureList = new ArrayList<Future<Integer>>();

        for(int i = 0;i < 1000;i++) {
            Future<Integer> future = service.submit(new Callable<Integer>() {
                public Integer call() throws Exception {
                    int a = new Random().nextInt(100);
                    int b = new Random().nextInt(100);
                    System.out.println("a + b = " + add(a,b));
                    return add(a,b);
                }
            });
            futureList.add(future);
        }

        for(int i = 0;i < futureList.size();i++) {
            try {
                System.out.println(futureList.get(i).get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static int add(int a, int b) {
        return a + b;
    }
}
