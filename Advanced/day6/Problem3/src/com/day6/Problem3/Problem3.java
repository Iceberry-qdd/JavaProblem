package com.day6.Problem3;

public class Problem3 {
    public static void main(String[] args){
        MyThread mt=new MyThread("继承Thread类：子线程");
        mt.start();
        MyRunnable mr=new MyRunnable();
        Thread t=new Thread(mr,"实现Runnable接口：子线程");
        t.start();
        System.out.println("main线程");
    }
}
