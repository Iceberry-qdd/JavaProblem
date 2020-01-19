package com.day8.Problem1;

import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] ch=str.toCharArray();
        System.out.print("录入的字符串：");
        for(int i=0;i<ch.length;i++)
            System.out.print(ch[i]);
        System.out.println();
        System.out.print("反转的字符串：");
        for(int i=ch.length-1;i>=0;i--)
            System.out.print(ch[i]);
    }
}
