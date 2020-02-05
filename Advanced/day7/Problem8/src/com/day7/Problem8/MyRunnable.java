package com.day7.Problem8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable{
    Lock lock=new ReentrantLock();
    @Override
    public void run(){
        lock.lock();
        System.out.println("我需要一个老师");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.print("老师");
        System.out.println("教我java,教完后，老师回到了办公室");
        lock.unlock();
    }
}
