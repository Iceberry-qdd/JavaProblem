package com.day8.Problem6;

import java.util.ArrayList;
public class Problem6 {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<>();
        ArrayList<String> dellist=new ArrayList<>();
        String[] str=new String[]{};
        list.add("bca");
        list.add("dadfa");
        list.add("ddddaaa");
        list.add("你好啊");
        list.add("我来了,你干嘛呢");
        list.add("别跑啊");
        System.out.println("源字符串：");
        System.out.println(list);
        System.out.println("删除后：");
        str=list.toArray(str);
        for(int i=0;i<str.length;i++)
            if(str[i].length()<=5)
                dellist.add(str[i]);
        System.out.println(dellist);
    }
}
