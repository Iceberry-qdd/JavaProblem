package com.day9.Problem1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem1 {
    public static void main(String[] args) throws IOException {
        String pathname="D:\\a.txt";
        File file=new File(pathname);
        FileOutputStream fos=new FileOutputStream(file);
        fos.write(97);
        fos.close();
    }
}
