package com.day11.Problem4;

public class Worker{
    public Apple pickApple(CompareAble compareable,Apple apple1,Apple apple2){
        return compareable.compare(apple1,apple2);
        //Compare compare1=new Compare();
        //compare1.compare(apple1,apple2);
        //compare1.compare(apple1,apple2,"红色");
    }
}
