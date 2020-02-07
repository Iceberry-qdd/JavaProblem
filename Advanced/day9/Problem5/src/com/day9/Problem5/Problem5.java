package com.day9.Problem5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Problem5 {
    public static void main(String[] args) throws IOException {
        String pathname="D:\\b.txt";
        File file=new File(pathname);
        FileInputStream fis=new FileInputStream(file);
        int length;
        byte[] b=new byte[2];
        while ((length=fis.read(b))!=-1){
            System.out.print(new String(b,0,length));
        }
        fis.close();
    }
}
