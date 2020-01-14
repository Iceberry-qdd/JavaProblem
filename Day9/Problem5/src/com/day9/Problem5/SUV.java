package com.day9.Problem5;

public class SUV extends Auto{
    private double small=4295;
    private double medium=5070;
    public SUV(){}
    public SUV(String brand,double length,double price){
        setBrand(brand);
        setLength(length);
        setPrice(price);
    }
    public int assort(/*double length*/){
        //boolean s=false,m=false;
        if(getLength()<small)
            return 1;
        else if(getLength()>medium)
            return 2;
        else
            return 3;
    }
}
