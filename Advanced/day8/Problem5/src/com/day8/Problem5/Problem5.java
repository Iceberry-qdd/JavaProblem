package com.day8.Problem5;

import java.io.File;

public class Problem5 {
    public static void main(String[] args){
        String pathname1="D:\\a.txt";
        String pathname2="D:\\aaa";
        File f1=new File(pathname1);
        File f2=new File(pathname2);
        System.out.println(f1.delete());
        System.out.println(f2.delete());
    }
}
