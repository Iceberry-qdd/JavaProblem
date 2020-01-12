package com.day7.Problem3;

import java.util.ArrayList;
public class Problem3 {
    public static void main(String[] args){
        int x=72;
        int[] jh=new int[]{83,72,83,83,77,75,72,72,67,65};//jh:集合
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<jh.length;i++)
            list.add(jh[i]);
        System.out.println("72的索引是"+findIndex(list,x));
        System.out.print("替换前：[");
        Print(list);
        System.out.print("替换后：[");
        replace(list);
        Print(list);
    }
    public static void Print(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++)
            if(i!=list.size()-1)
                System.out.print(list.get(i)+"，");
            else
                System.out.print(list.get(i));
            System.out.println("]");
    }
    public static int findIndex(ArrayList<Integer> list, int x){
        int a=-1;
        for(int i=0;i<list.size();i++)
            if(list.get(i)==x) {
                a=i;
                break;
            }
        return a;
    }
    public static void replace(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++)
            if(list.get(i)==72)
                list.set(i,27);
    }
}
