package com.day8.Problem4;

import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args){
        System.out.print("请输入源字符串：");
        Scanner sc1=new Scanner(System.in);
        sc1.useDelimiter("\n");//将用户输入的空格看作内容而不是当作结束输入的标志
        String srcStr=sc1.next();
        System.out.print("请输入要删除的字符串：");
        Scanner sc2=new Scanner(System.in);
        String delStr=sc2.next();
        //srcStr.replace(" ","♂");

        System.out.println("源字符串中总共包含："+Times(srcStr,delStr)+"个"+delStr+"，");
        System.out.print("删除"+delStr+"后的字符串为：");
        NewString(srcStr,delStr);
        //System.out.println(srcStr);
    }
    public static int Times(String srcStr,String delStr){
        String[] newsrcStr=srcStr.split(delStr);
        return newsrcStr.length-1;
    }
    public static void NewString(String srcStr,String delStr){
        String[] newsrcStr=srcStr.split(delStr);
        for(int i=0;i<newsrcStr.length;i++)
            System.out.print(newsrcStr[i]);
    }
}
