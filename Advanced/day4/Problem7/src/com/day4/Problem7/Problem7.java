package com.day4.Problem7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Problem7 {
    public static void main(String[] args){
        String[] key=new String[]{"黑龙江省","浙江省","江西省","广东省","福建省"};
        String[] value=new String[]{"哈尔滨","杭州","南昌","广州","福州"};
        Map<String,String> map=new HashMap<>();
        for(int i=0;i<key.length;i++)
            map.put(key[i],value[i]);
        /*Set<String> keys=map.keySet();
        for(String Key:keys){
            String Value=map.get(Key);
            System.out.println(Key+"-"+Value);
        }*/
        System.out.println(map);
    }
}
