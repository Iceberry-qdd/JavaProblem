package com.day11.Problem4;

public interface CompareAble{
    default Apple compare(Apple apple1, Apple apple2){
        Apple tempApple=new Apple();
        if(apple1.getSize()>apple2.getSize())
            tempApple=apple1;
        else if(apple1.getSize()<apple2.getSize())
            tempApple=apple2;
        return tempApple;
    }
}
