package com.day8.Problem8;

import java.io.File;

public class Problem8 {
    public static void main (String[] args){
        String pathname = "test";
        File dir = new File(pathname);
        File[] files = dir.listFiles(pathname1 -> true);
        for (File file : files){
            if(file.isFile())
                System.out.println(file.getName());
        }
    }
}
