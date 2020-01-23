package com.day5.Problem9;

public class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("\n"+getName());
        for(int i=1;i<101;i++)
            if(i%2==0)
                System.out.print(i+" ");
    }
}
