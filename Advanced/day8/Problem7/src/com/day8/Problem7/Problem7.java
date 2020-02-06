package com.day8.Problem7;

import java.io.File;

public class Problem7 {
    public static void main (String[] args){
        File dir= new File("test");
        print(dir);//判断文件"aaa.txt"和目录"bbb"
    }

    public static void print (File dir) {
        File[] files = dir.listFiles(pathname -> pathname.isDirectory()||pathname.getName().equals("aaa.txt"));
        for (File file : files)
            if (file.isFile()) {
                System.out.println(file.getName() + "是一个文件");
                System.out.println(file.getName() + "不是一个文件夹");
            }
            else if (file.getName().equals("bbb")) {
                System.out.println(file.getName() + "是一个文件夹");
                System.out.println(file.getName() + "不是一个文件");
            }
    }
}
