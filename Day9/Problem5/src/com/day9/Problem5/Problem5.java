package com.day9.Problem5;

import java.util.ArrayList;
public class Problem5 {
    public static void main(String[] args){
        SUV suv1=new SUV("SVU",4813,760000);
        SUV suv2=new SUV("SVU",4545,188800);
        SUV suv3=new SUV("SVU",4100,560400);
        SUV suv4=new SUV("SVU",5123,1260000);
        ArrayList<SUV> list=new ArrayList<>();
        list.add(suv1);
        list.add(suv2);
        list.add(suv3);
        list.add(suv4);
        for(int i=0;i<list.size();i++)
            if(list.get(i).assort()==3)
                Print(list.get(i));
    }
    public static void Print(SUV suv) {//为什么必须是static?
        System.out.println("车型：" + suv.getBrand());
        System.out.println("    价格：" + suv.getPrice());
        System.out.println("    车长：" + suv.getLength());
    }
}
