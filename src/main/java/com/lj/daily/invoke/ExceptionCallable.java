package com.lj.daily.invoke;

import java.util.concurrent.Callable;

/**
 * 可能在执行过程中抛出空指针异常的任务
 * Created by zhouzhanghe on 2016/9/29.
 */
public class ExceptionCallable implements Callable<String> {

    private String name = null;

    public ExceptionCallable() {
    }

    public ExceptionCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.println("begin to ExceptionCallable.");

        System.out.println(name.length());

        System.out.println("end to ExceptionCallable.");

        return name;
    }

}
