package com.day8.Problem5;

import java.util.Random;
public class Problem5 {
    public static void main(String[] args){
        Random r=new Random();
        double number=r.nextDouble()*100;
        System.out.println("随机数为："+""+number);
        System.out.println("转换后："+""+String.format("%.2f",number));
    }
}
