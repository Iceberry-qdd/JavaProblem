package com.day8.Problem3;

import java.io.File;

public class Problem3 {
    public static void main(String[] args){
        String pathname="D:\\bbb";
        File file=new File(pathname);
        file.mkdir();
    }
}
