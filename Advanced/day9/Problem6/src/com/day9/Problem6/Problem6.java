package com.day9.Problem6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("E:\\a.png");
        FileOutputStream fos=new FileOutputStream("D:\\a.png");
        int b;
        while ((b=fis.read())!=-1){
            fos.write(b);
        }
        fos.close();
        fis.close();
    }
}
