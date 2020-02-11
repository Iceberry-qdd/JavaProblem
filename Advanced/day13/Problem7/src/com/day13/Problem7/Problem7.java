package com.day13.Problem7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem7 {
    public static void main(String[] args) {
        String[] arr1 = new String[]{"郭靖", "杨康"};
        String[] arr2 = new String[]{"黄蓉", "穆念慈"};
        Stream<String> stream1 = Arrays.stream(arr1);
        Stream<String> stream2 = Arrays.stream(arr2);
        List<String> list = Stream.concat(stream1, stream2).collect(Collectors.toList());
        for (String string : list)
            System.out.println(string);
    }
}
