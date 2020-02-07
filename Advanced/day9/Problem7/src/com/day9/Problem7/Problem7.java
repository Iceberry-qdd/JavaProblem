package com.day9.Problem7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("info.txt",true);
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        while (!str.equals("886")){
            fw.write(str+"\r\n");
            fw.flush();
            str=sc.next();
        }
        fw.close();
    }
}
