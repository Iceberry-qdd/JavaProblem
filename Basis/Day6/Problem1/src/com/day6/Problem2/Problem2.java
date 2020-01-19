package com.day6.Problem2;

public class Problem2 {
    public static void main(String[] args){
    Circle c=new Circle(8);
    System.out.print("半径为："+c.getR());
        System.out.print("，面积为：");
        c.showArea();
        System.out.print("，周长为：");
        c.showPerimeter();
    }
}
