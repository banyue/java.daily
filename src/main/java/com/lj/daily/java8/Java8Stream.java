package com.lj.daily.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author lijin <p>lijin@imdada.cn</p>
 * @date 2017/2/9.
 */
public class Java8Stream {

    public static void main(String args[]) {
        // 1. Individual values
        //Stream stream = Stream.of("a", "b", "c");
        // 2. Arrays
        String [] strArray = new String[] {"a", "b", "c"};
        //Stream stream = Stream.of(strArray);
        Stream stream = Arrays.stream(strArray);
        // 3. Collections
        //List<String> list = Arrays.asList(strArray);
        //stream = list.stream();

        IntStream.of(new int[]{1, 2, 3}).forEach(System.out::println);
        IntStream.range(1, 3).forEach(System.out::println);
        IntStream.rangeClosed(1, 3).forEach(System.out::println);

        // 1. Array
        /**String[] strArray1 = stream.toArray(String[]::new);
        // 2. Collection
        List<String> list1 = stream.collect(Collectors.toList());
        List<String> list2 = stream.collect(Collectors.toCollection(ArrayList::new));
        Set set1 = stream.collect(Collectors.toSet());
        Stack stack1 = stream.collect(Collectors.toCollection(Stack::new));
        // 3. String
        String str = stream.collect(Collectors.joining()).toString();
         */
    }
}

