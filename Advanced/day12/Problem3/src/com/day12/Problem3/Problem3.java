package com.day12.Problem3;

import static java.lang.Integer.toHexString;

public class Problem3 {
    public static void main(String[] args) {
        int num = 42;
        decToHex(num, s -> toHexString(num));
    }

    private static void decToHex(int num, NumberToString nts) {
        System.out.println(nts.convert(num));
    }
}
