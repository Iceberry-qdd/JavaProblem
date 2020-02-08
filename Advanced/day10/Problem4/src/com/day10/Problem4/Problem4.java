package com.day10.Problem4;

import java.io.*;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        createData(bw);
        System.out.println((verify(br)?"验证成功":"验证失败"));
    }

    public static void createData(BufferedWriter bw) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入验证码库：");
        String str = sc.next();
        while (!str.equals("#")) {
            bw.write(str);
            bw.newLine();
            bw.flush();
            str = sc.next();
        }
        bw.close();
    }

    public static boolean verify(BufferedReader br) throws IOException {
        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要校验的验证码：");
        String line;
        String str = sc.next();
        while ((line = br.readLine()) != null)
            if (str.equals(line)) {
                flag=true;
                break;
            }
        return flag;
    }
}