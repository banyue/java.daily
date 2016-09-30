package com.lj.daily.thread;

import java.util.concurrent.*;

/**
 * Created by zhouzhanghe on 2016/9/28.
 */
public class CallableAndFuture3 {

    public static void main(String args[]) {
        ExecutorService service = Executors.newCachedThreadPool();
        CompletionService<Integer> cs = new ExecutorCompletionService<Integer>(service);

        for(int i=0;i < 5;i++) {
            final int taskId = i;
            cs.submit(new Callable<Integer>() {
                public Integer call() throws Exception {
                    return taskId;
                }
            });
        }

        for(int i=0;i < 5;i++) {
            try {
                System.out.println(cs.take().get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
