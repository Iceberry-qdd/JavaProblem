package com.day10.Problem6;

import java.io.*;

public class Problem6 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("a.txt"),"GBK");
        int read;
        while ((read=isr.read())!=-1){
            System.out.print((char)read);
        }
        isr.close();
    }
}
