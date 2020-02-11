package com.day13.Problem5;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Problem5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("陈玄风");
        list.add("梅超风");
        list.add("陆乘风");
        list.add("曲灵风");
        list.add("武眠风");
        list.add("冯默风");
        list.add("罗玉风");
        Stream<String> stream1 = list.stream().limit(2);
        Stream<String> stream2 = list.stream().skip(5);
        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);
    }
}
