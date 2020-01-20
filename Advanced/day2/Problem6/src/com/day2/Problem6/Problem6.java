package com.day2.Problem6;

import java.util.ArrayList;
import java.util.Collection;
public class Problem6 {
    public static void main(String[] args){
            ArrayList<String> al2=new ArrayList<>();
            ArrayList<String> al1=new ArrayList<>();
            al1.add("apple");
            al1.add("pear");
            al1.add("banana");
            al1.add("strawberry");
            al1.add("coconut");
            System.out.println("集合1是否为空："+listTest(al1));
            System.out.println("集合2是否为空："+listTest(al2));
    }
    public static boolean listTest(ArrayList<String> al){
        boolean flag=false;
        Collection<String> coll=new ArrayList<>();
        coll.addAll(al);//将for循环add()改为addAll();
        if(coll.isEmpty())
            flag=true;
        return flag;
    }
}
