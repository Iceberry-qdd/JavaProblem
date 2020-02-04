package com.day6.Problem3;

public class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println(getName());
    }
}
