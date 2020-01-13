package com.day8.Problem7;

import java.lang.reflect.Array;
import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("回文数："+IsPalindrome(str));
        }
    public static boolean IsPalindrome(String str){
        //int end=str.length();
        boolean flag=true;
        for(int min=0,max=str.length()-1;min<=max;min++,max--)
            if(str.charAt(min)!=str.charAt(max))
                flag=false;
        return flag;
    }
}
