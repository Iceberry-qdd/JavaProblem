package com.day8.Problem3;

import java.util.Scanner;
public class Problem3 {
    public static  void main(String[] args){
        System.out.print("请输入大字符串：");
        Scanner sc1=new Scanner(System.in);
        String s1=sc1.next();
        System.out.print(""+"请输入小字符串：");
        Scanner sc2=new Scanner(System.in);
        String s2=sc2.next();
        System.out.println("小字符串"+s2+"，在大字符串中共出现"+Times(s1,s2)+"次");
    }
    /*自己写的这个真不好，之后才发现是用split来实现
    public static int Times(String s1,String s2){
        int t=0;
            s1=s1.replace(s2, "♂");
        for(int i=0;i<s1.length();i++)
            if(s1.charAt(i)=='♂')
                t++;
        return t;
    }*/
    public static int Times(String s1,String s2){
        String[] newsrcStr=s1.split(s2);
        return newsrcStr.length-1;
    }
}
