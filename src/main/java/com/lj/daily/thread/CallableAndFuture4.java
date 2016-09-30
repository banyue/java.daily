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

        for(int i = 0;i < 5;i++) {
            Future<Integer> future = service.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int ran = new Random().nextInt(100);
                    System.out.println(": " + ran);
                    return ran;
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
}
