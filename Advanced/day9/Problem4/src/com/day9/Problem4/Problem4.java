package com.day9.Problem4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Problem4 {
    public static void main(String[] args) throws IOException {
        String pathname="D:\\a.txt";
        File file=new File(pathname);
        FileInputStream fis=new FileInputStream(file);
        int b;
        while ((b=fis.read())!=-1){
            System.out.print((char) b);
        }
        fis.close();
    }
}
