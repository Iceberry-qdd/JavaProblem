package com.day7.Problem7;

import java.util.ArrayList;
public class MyList{
    private ArrayList<Integer> element=new ArrayList<>();
    //int[] element=new int[100];
    public MyList(){}
    public void add(int e){
        element.add(e);
    }
    public void remove(){
        int a=element.size()-1;
        element.remove(element.size()-1);
        System.out.println(a);
    }
    public void show(){
        System.out.print("[");
        for(int i=0;i<element.size();i++)
            if(i!=element.size()-1)
                System.out.print(element.get(i)+"，");
            else
                System.out.print(element.get(i));
        System.out.println("]");
    }
}
