package com.day8.Problem7;

import java.util.Scanner;
public class Problem7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("回文数："+IsPalindrome(str));
        }
    public static boolean IsPalindrome(String str){
        boolean flag=true;
        for(int min=0,max=str.length()-1;min<=max;min++,max--)
            if(str.charAt(min)!=str.charAt(max)) {
                flag = false;
                break;//[v2.0]新增跳出语句[2020-1-17]
            }
        return flag;
    }
}
