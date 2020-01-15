package com.day10.Problem5;

public class Problem5 {
    public static void main(String[] args){
        Star star=new Star();
        star.shine();
        System.out.println("====================");
        Star star1=new Sun();//用多态方式创建Sun对象
        if(star1 instanceof Sun) {
            Sun s = (Sun)star1;//向下转型
            s.doAnything();//调用doAnything方法
        }
        star1.shine();//调用Sun的shine()方法
    }
}
