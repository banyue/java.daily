package com.lj.daily.invoke;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * 正常的短时任务，产生10个随机字符组成的字符串
 * Created by zhouzhanghe on 2016/9/29.
 */
public class RandomTenCharsTask implements Callable<String> {

    public String call() throws Exception {
        System.out.println("RandomTenCharsTask begin to execute...");

        StringBuffer content = new StringBuffer();

        String base = "abcdefghijklmnopqrstuvwxyz0123456789";

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(base.length());
            content.append(base.charAt(number));
        }

        System.out.println("RandomTenCharsTask complete.result=" + content);
        return content.toString();
    }
}
