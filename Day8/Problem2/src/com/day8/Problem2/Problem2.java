package com.day8.Problem2;

import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print("这个QQ号码是否正确："+IsCorrect(str));
    }
    /*[v1.0]旧代码，只考虑输入字符为数字的情形
    public static boolean IsCorrect(String str){
        boolean flag=false;
        if(str.length()<13&&str.length()>4)
            if (str.charAt(0) !='0' )
                flag = true;
        return flag;
    }*/
    //[v2.0]考虑了输入字符为非数字的情形,以下为新代码：[2020-1-17]
    public static boolean IsCorrect(String str){
        boolean flag=false,flag1=false,flag2=false,flag3=true;
        if(str.length()<13&&str.length()>4)
            flag1=true;
        if(str.charAt(0) !='0')
            flag2=true;
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)<'0'||str.charAt(i)>'9') {
                flag3 = false;
                break;
            }
        if(flag1&&flag2&&flag3)
            flag=true;
        return flag;
    }
}
