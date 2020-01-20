package com.day2.Problem2;

import java.util.ArrayList;
import java.util.Collection;
public class Problem2 {
    public static void main(String[] args){
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        System.out.println("a:"+listTest(list, "a"));
        System.out.println("b:"+listTest(list, "b"));
        System.out.println("c:"+listTest(list, "c"));
        System.out.println("xxx:"+listTest(list, "xxx"));
    }
    //以下为listTest()方法的实现部分
    public static int listTest(Collection<String> list, String str){
        int count=0;
        for(String str1:list)//使用增强for循环
            if(str1==str)
                count++;
        return count;
    }
}
