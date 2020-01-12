package com.day7.Problem7;

import java.util.ArrayList;
public class Problem7 {
    public static void main(String[] args){
        MyList list1=new MyList();
        System.out.println("添加元素后：");
        for(int i=0;i<3;i++)
            list1.add(i);
        list1.show();
        System.out.println("获取元素：");
        list1.remove();
        System.out.println("获取元素后：");
        list1.show();
    }
}
