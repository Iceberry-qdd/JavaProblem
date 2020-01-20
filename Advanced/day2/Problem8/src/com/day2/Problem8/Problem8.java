package com.day2.Problem8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Problem8 {
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(1);
        int s1=1,s2=6;
        System.out.println("元素"+s1+"在集合中首次出现的索引为："+listTest(al,s1));
        System.out.println("元素"+s2+"在集合中首次出现的索引为："+listTest(al,s2));
    }
    public static int listTest(ArrayList<Integer> al,Integer s){
        int index=-1;
        Collection<Integer> coll=new ArrayList<>();
        coll.addAll(al);//将for循环add()改为addAll();
        Iterator<Integer> it=coll.iterator();//试一下迭代器
        while(it.hasNext()){
            Integer integer=it.next();
            if(integer==s)
                index=integer.hashCode();
        }
        return index;
    }
}
