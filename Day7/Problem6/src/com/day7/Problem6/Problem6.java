package com.day7.Problem6;

import java.util.ArrayList;
import java.util.Random;
public class Problem6 {
    public static void main(String[] args) {
        printNewPoke(getNewPoke(getPoke()), 5);
        printNewPoke(getNewPoke(getPoke()), 55);
    }
    public static ArrayList<String> getPoke() {
        String[] hs = new String[]{"黑桃", "方片", "红桃", "梅花"};
        String[] ds = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        ArrayList<String> poke = new ArrayList<>();
        for (int i = 0; i < hs.length; i++)
            for (int j = 0; j < ds.length; j++)
                poke.add(hs[i] + ds[j]);
        return poke;
    }
    public static ArrayList<String> getNewPoke(ArrayList<String> poke) {
        ArrayList<String> newpoke = new ArrayList<>();
        Random num = new Random();

        for (int i = 0; i < 5; i++) {
            int n = num.nextInt(53);
            newpoke.add(poke.get(n));
        }
        return newpoke;
    }
    public static void printNewPoke(ArrayList<String> newpoke, int n) {
        System.out.println("随机" + n + "张牌：");
        for (int i = 0; i < n; i++)
            if (n <= 52 && n >= 0) {
                System.out.print(newpoke.get(i) + " ");
            }
            else{
                System.out.println("超越范围，无法获取");
                break;
            }
        System.out.println();
    }
}
