package com.day3.Problem9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Problem9 {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,33,11,77,55);
        System.out.println("按自然顺序排序（从小到大）：");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("自定义排序规则（从大到小）：");
        Collections.sort(list, new Comparator<Integer>(){
            @Override
           public int compare(Integer o1,Integer o2){
               return o2-o1;
           }
        });
        System.out.println(list);
    }
}
