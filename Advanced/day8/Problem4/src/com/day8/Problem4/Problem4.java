package com.day8.Problem4;

import java.io.File;

public class Problem4 {
    public static void main(String[] args){
        String pathname="D:\\ccc\\bbb\\aaa";
        File file=new File(pathname);
        file.mkdirs();
    }
}
