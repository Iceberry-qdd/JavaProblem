package com.qdd.Test3;

public class Test3 {
    public static void main(String[] args) {
        String[] hs = new String[]{"黑桃", "红桃", "梅花", "方片"};//hs:花色
        String[] ds = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};//ds:点数
        System.out.print(hs[0] + ds[0]+" ");
        System.out.print(hs[0] + ds[4]+" ");
        System.out.print(hs[3] + ds[10]+" ");
    }
}
