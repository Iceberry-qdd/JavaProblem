package com.day12.Problem2;

public class Problem2 {
    public static void main(String[] args) {
        int a = 2, b = 3;
        getProduct(a, b, (a1, b1) -> a1 * b1);
    }

    private static void getProduct(int a, int b, IntCalc calc) {
        System.out.println(calc.calc(a, b));
    }
}
