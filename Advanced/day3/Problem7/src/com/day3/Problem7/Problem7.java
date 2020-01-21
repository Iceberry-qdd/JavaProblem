package com.day3.Problem7;

import java.util.ArrayList;
import java.util.List;
public class Problem7 {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("二丫");
        list.add("钱六");
        list.add("孙七");
        System.out.print("list集合为："+list);
        list.set(3,"王小丫");
        System.out.print("\n替换后list集合为："+list);
    }
}
