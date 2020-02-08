package com.day10.Problem5;

import java.io.*;

public class Problem5 {
    public static void main(String[] args) throws IOException {
        String str="我爱Java";
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("a.txt"),"GBK");
        osw.write(str);
        osw.close();
    }
}
