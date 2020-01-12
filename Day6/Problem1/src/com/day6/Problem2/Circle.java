package com.day6.Problem2;

public class Circle{
    private double r;
    public Circle(){}
    public Circle(double r){
        this.r=r;
    }
    public double getR(){
        return r;
    }
    public void SetR(double r){
        this.r=r;
    }
    public void showArea(){
        System.out.print(3.14*r*r);
    }
    public void showPerimeter(){
        System.out.print(2*3.14*r);
    }
}
