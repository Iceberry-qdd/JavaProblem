package com.day7.Problem8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Problem8 {
    public static void main(String[] args){
        ExecutorService service= Executors.newFixedThreadPool(2);
        MyRunnable r=new MyRunnable();
        service.submit(r);
    }
}
