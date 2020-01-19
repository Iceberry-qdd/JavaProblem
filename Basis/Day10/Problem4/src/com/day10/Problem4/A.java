package com.day10.Problem4;

public interface A{
    public abstract void showA();
    static void show10(String str){
        System.out.println("static "+str);
        for (int i=0;i<10;i++)
            System.out.print(str+" ");
        System.out.println("");
    }
    public static void showB10(){
        show10("BBBB");
    }
    public static void showC10(){
        show10("CCCC");
    }
}
