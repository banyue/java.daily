package com.lj.daily.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author lijin <p>lijin@imdada.cn</p>
 * @date 2017/2/14.
 */
public class ThreadPoolCallerRunsPolicy {

    //让可执行程序休息一下
    private static int executePrograms = 0;
    private static int produceTaskMaxNumber = 10;

    public static void main(String[] args) {
        // 构造一个线程池
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2, 4, 3,
                TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(3),
                new ThreadPoolExecutor.CallerRunsPolicy());

        for (int i = 1; i <= produceTaskMaxNumber; i++) {
            try {
                String task = "task@ " + i;
                System.out.println("put " + task);
                threadPool.execute(new ThreadPoolTask(task));

                // 便于观察，等待一段时间
                Thread.sleep(executePrograms);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
