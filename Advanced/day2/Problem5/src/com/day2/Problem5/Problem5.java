package com.day2.Problem5;

import java.util.ArrayList;
import java.util.Collection;
public class Problem5 {
    public static void main(String[] args){
        ArrayList<String> al=new ArrayList<>();
        al.add("apple");
        al.add("pear");
        al.add("banana");
        al.add("strawberry");
        al.add("coconut");
        String str1="pear";
        String str2="grape";
        System.out.println("集合里是否包含"+str1+"："+listTest(al,str1));
        System.out.println("集合里是否包含"+str2+"："+listTest(al,str2));
    }
    public static boolean listTest(ArrayList<String> al,String s){
        boolean flag=false;
        Collection<String> coll=new ArrayList<>();
        for(int i=0;i<al.size();i++)
            coll.add(al.get(i));
        if(coll.contains(s))
            flag=true;
        return flag;
    }
}
