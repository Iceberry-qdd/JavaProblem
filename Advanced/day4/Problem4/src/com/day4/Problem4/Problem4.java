package com.day4.Problem4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Problem4 {
    public static void main(String[] args){
        HashMap<String,String> map=new HashMap<>();
        for(int i=0;i<10;i++)
            map.put("pow"+i, String.valueOf(i*i));
        System.out.println("原map集合为：\n"+map);
        Set<Map.Entry<String,String>> entrySet=map.entrySet();
        System.out.println("使用增强for遍历输出所有value：");
        for(Map.Entry<String,String> entry:entrySet){
            String value=entry.getValue();
            System.out.print(value+" ");
        }
        System.out.println("\n使用迭代器遍历输出所有value：");
        Iterator<Map.Entry<String, String>> it=entrySet.iterator();
        while(it.hasNext()){
            String value=it.next().getValue();
            System.out.print(value+" ");
        }
    }
}
