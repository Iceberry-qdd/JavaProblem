package com.day9.Problem2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem2 {
    public static void main(String[] args) throws IOException {
        String pathname="D:\\b.txt";
        File file=new File(pathname);
        FileOutputStream fos=new FileOutputStream(file);
        byte[] b="i love java".getBytes();
        fos.write(b);
        fos.close();
    }
}
