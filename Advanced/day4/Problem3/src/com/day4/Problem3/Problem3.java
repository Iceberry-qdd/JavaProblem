package com.day4.Problem3;

import java.util.HashMap;
public class Problem3 {
    public static void main(String[] args){
        HashMap<Integer,String> map=new HashMap<Integer, String>();
        String str=new String("test");
        for(int i=0;i<10;i++)
            map.put(i,str+i);
        System.out.println("原map集合：\n"+map);
        System.out.println("删除键为1的值"+map.remove(1));
        System.out.println("删除后的map集合为：\n"+map);
        System.out.println("取出键为3的值："+map.get(3));
    }
}
