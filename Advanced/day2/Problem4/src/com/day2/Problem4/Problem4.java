package com.day2.Problem4;

import java.util.ArrayList;
import java.util.Collection;
public class Problem4 {
    public static void main(String[] args){
        long start=System.currentTimeMillis();
        Collection<Integer> coll=new ArrayList<>();
        for(int i=0;i<100;i++)
            coll.add(i+1);
        Object[] objects=coll.toArray();
        for(int i=0;i<objects.length;i++)
            if(i%9!=0||i==0)
                System.out.print(objects[i]+" ");
            else
                System.out.println(objects[i]);
        long end=System.currentTimeMillis();
        System.out.println("程序执行完毕，共耗时："+(end-start)+"毫秒");
    }
}
