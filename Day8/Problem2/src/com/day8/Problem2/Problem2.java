package com.day8.Problem2;

import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print("这个QQ号码是否正确："+IsCorrect(str));
    }
    public static boolean IsCorrect(String str){
        boolean flag=false;
        if(str.length()<13&&str.length()>4)
            if (str.charAt(0) !='0' )
                flag = true;
        return flag;
    }
}
