package com.day5.Problem9;

public class Problem9 {
    public static void main(String[] args){
        System.out.println("主进程：");
        for(int i=1;i<101;i++)
            if(i%2!=0)
            System.out.print(i+" ");
        MyThread mt=new MyThread("子进程:");
        mt.start();
    }
}
