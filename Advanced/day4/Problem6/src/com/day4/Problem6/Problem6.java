package com.day4.Problem6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Problem6 {
    public static void main(String[] args){
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
        System.out.println("keySet方式遍历原集合：");
        print(map);
        System.out.println("\n插入[键为5，值为李晓红]后集合：");
        map.put(5,"李晓红");
        print(map);
        System.out.println("\n删除1号键后集合：");
        map.remove(1);
        print(map);
        System.out.println("\n更改键为2的值为周琳后集合：");
        map.put(2,"周琳");
        print(map);
        System.out.println("\n最终集合：");
        print(map);
    }
    public static void print(Map<Integer,String> map){
        Set<Integer> keys=map.keySet();
        for(Integer key:keys){
            String value=map.get(key);
            System.out.print(key+"-"+value+" ");
        }
    }
}
