package com.lj.daily.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 多线程顺序执行
 * Created by zhouzhanghe on 2016/9/29.
 */
public class OrderThread {

    static List<Integer> old = new ArrayList<Integer>();

    public static void startMoreThread() {
        ExecutorService service = Executors.newSingleThreadExecutor();

        for(int i = 0;i < 10; i++) {
            service.submit(new Runnable() {
                public void run() {
                    getRandom();
                }
            });
        }
    }

    public static void getRandom() {
        Random random = new Random();
        int a = random.nextInt(100);
        old.add(a);
        System.out.println(a);
    }

    public static void main(String args[]) throws Exception {
        startMoreThread();  //线程池是非阻塞线程，不影响主线程的执行，因此如果主线程不睡眠，old将是空的。单线程池可保证线程的执行顺序
        Thread.sleep(10000);
        System.out.println("size:" + old.size());
        for(int i = 0;i < old.size(); i++) {
            System.out.print(old.get(i) + ",");
        }
    }
}
