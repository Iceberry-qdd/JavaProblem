package com.day8.Problem6;

import java.io.File;

public class Problem6 {
    public  static  void main (String[] args) {
        String pathname = "D:\\aaa";
        File dir = new File(pathname);
        File[] files=dir.listFiles();
        for(File file : files)
            if(file.isFile()){
                System.out.println("文件名称：" + file.getName());
                System.out.println("文件长度：" +file.length());
                System.out.println("文件绝对路径："+file.getAbsolutePath());
                System.out.println("文件父路径："+file.getPath());
            }
    }
}
