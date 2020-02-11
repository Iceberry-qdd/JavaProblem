package com.day13.Problem4;

import java.util.ArrayList;
import java.util.List;

public class Problem4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("黄药师");
        list.add("冯蘅");
        list.add("郭靖");
        list.add("黄蓉");
        list.add("郭芙");
        list.add("郭襄");
        list.add("郭破虏");
        list.stream().filter(s -> s.startsWith("郭")).forEach(System.out::println);
    }
}
