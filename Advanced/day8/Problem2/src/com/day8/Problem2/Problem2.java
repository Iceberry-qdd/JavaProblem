package com.day8.Problem2;

import java.io.File;
import java.io.IOException;

public class Problem2 {
    public static void main(String[] args) throws IOException {
        String pathname="D:\\a.txt";
        File file=new File(pathname);
        System.out.println("是否存在："+file.exists());
        System.out.println("是否创建："+file.createNewFile());
        System.out.println("是否存在："+file.exists());
    }
}
