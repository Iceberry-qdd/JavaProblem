package com.day7.Problem4;

import java.util.Random;
import java.util.ArrayList;
public class Problem4 {
    public static void main(String[] args){
        printCount(getNumList());
    }
    public static ArrayList<Integer> getNumList(){
        ArrayList<Integer> list=new ArrayList<>();
        Random num=new Random();
        for(int i=0;i<100;i++) {
            int n = num.nextInt(10 - 1 + 1) + 1;
            list.add(n);
        }
        return list;
    }
    public static void printCount(ArrayList<Integer> list){
        int[] a=new int[10];
        for(int i=0;i<list.size();i++)
            for(int j=0;j<a.length;j++)
                if (list.get(i) == (j+1))
                    a[j]++;
        for(int i=0;i<a.length;i++)
            System.out.println("数字："+(i+1)+"--"+a[i]+"次");
        }
    }