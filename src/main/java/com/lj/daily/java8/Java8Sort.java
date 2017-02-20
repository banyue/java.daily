package com.lj.daily.java8;

import java.util.*;

/**
 * @author lijin <p>lijin@imdada.cn</p>
 * @date 2017/2/17.
 */
public class Java8Sort {

    public static void main(String args[]) {
        Random random = new Random();
        List<User> list = new ArrayList<>();
        User user;
        for(int i = 0;i < 10;i++) {
            user = new User();
            user.setAge(i + random.nextInt(100));
            user.setState(random.nextInt(10));
            user.setName("beji" + random.nextInt(1000));
            user.setCreateTime(new Date());
            list.add(user);
        }

        list.sort(Comparator.comparing(User::getName).thenComparing(User::getAge).thenComparing(User::getState).thenComparing(User::getCreateTime));

        for(User u : list) {
            System.out.println(u.toString());
        }
    }
}
