package com.day11.Problem4;

public class Problem4 {
    public static void main(String[] args){
        Worker worker=new Worker();
        Apple apple1=new Apple(5,"青色");
        Apple apple2=new Apple(3,"红色");
        Compare c1=new Compare();
        c1.compare(apple1,apple2);
        //worker.pickApple(c1,apple1,apple2);
        CompareAble c2=new CompareAble() {
            @Override
            public Apple compare(Apple apple1, Apple apple2) {
                    Apple tempApple=new Apple();
                    if(apple1.getColor()=="红色")
                        tempApple=apple1;
                    else if(apple2.getColor()=="红色")
                        tempApple=apple2;
                    return tempApple;
                }

        };
        //worker.pickApple(c2,apple1,apple2);
        c2.compare(apple1,apple2);
        System.out.println("默认挑大的：");
        System.out.println(worker.pickApple(c1,apple1,apple2).getSize()+"-"+worker.pickApple(c1,apple1,apple2).getColor());
        System.out.println("挑红的：");
        System.out.println(worker.pickApple(c2,apple1,apple2).getSize()+"-"+worker.pickApple(c2,apple1,apple2).getColor());
    }
}
