package com.day2.Problem3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Problem3 {
    public static void main(String[] args){
        int[] array=new int[]{1,2,3,4,5,6,7,8,9,0};
        Collection<Integer> coll=toCollection(array);//调用toCollection方法
        Iterator<Integer> it=coll.iterator();
        System.out.print("数组为：");
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
        System.out.print("\n转换为集合后：");//输出转换为集合后的元素
        while(it.hasNext()){
            int num=it.next();
            System.out.print(num+" ");
        }
    }
    //定义toCollection方法，将int数组转换为集合并返回
    public static Collection<Integer> toCollection(int[] array){
        Collection<Integer> coll=new ArrayList<>();
        for(int i=0;i<array.length;i++)
            coll.add(array[i]);
        return coll;
    }
}
