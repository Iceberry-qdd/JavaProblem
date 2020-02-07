package com.day9.Problem3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem3 {
    public static  void main(String[] args) throws IOException {
        String pathname="D:\\c.txt";
        File file=new File(pathname);
        FileOutputStream fos=new FileOutputStream(file,true);
        byte[] words="i love java".getBytes();
        fos.write("\r\n".getBytes());
        for(int i=0;i<5;i++){
            fos.write(words);
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
