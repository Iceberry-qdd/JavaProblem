package com.day7.Problem1;

import java.util.Random;
public class Problem1 {
    public static void main(String[] args) {
        String S = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        char[] c = new char[6];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                int k = r.nextInt(S.length());
                c[j] = S.charAt(k);
            }
            String s = S.valueOf(c);
            System.out.println("随机验证码：" + s);
        }
    }
}
