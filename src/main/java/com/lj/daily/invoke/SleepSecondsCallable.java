package com.lj.daily.invoke;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * 通过睡眠模拟耗时任务，该任务是可中断/可终止的任务，能够相应中断请求
 * Created by zhouzhanghe on 2016/9/29.
 */
public class SleepSecondsCallable implements Callable<String> {

    private String name;
    private int seconds;

    public SleepSecondsCallable(String name, int seconds) {
        this.name = name;
        this.seconds = seconds;
    }

    public String call() throws Exception {
        System.out.println(name + ",begain to execute");

        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println(name + " was distributed during sleeping.");
            e.printStackTrace();
            return name + "_SleepSecondsCallable_failed";
        }

        System.out.println(name + ",success to execute");

        return name + "_SleepSecondsCallable_success";
    }
}
