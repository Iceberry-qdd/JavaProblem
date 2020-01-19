package com.qdd.Test1;

public class Test1 {
    public static void main(String[] args){
        int[] a=new int[]{10,20,30,40,50,60,66,70,80,99};
        System.out.println("您的大乐透号码为：");
        Print(a);
    }
    public static void Print(int[] a){
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
