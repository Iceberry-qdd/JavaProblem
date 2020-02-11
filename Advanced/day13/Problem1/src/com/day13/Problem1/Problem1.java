package com.day13.Problem1;

import java.util.function.Predicate;

import static java.lang.Math.abs;

public class Problem1 {
    public static void main(String[] args) {
        Integer[] arr = {-12345, 9999, 520, 0, -38, -7758520, 941213};
        int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
        Predicate<Integer> p1 = a -> a >= 0;
        Predicate<Integer> p2 = a -> abs(a) > 100;
        Predicate<Integer> p3 = a -> a % 2 == 0;
        for (Integer integer : arr) {
            if (p1.test(integer))
                count1++;
            if (p1.negate().test(integer))
                count2++;
            if (p2.and(p3).test(integer))
                count3++;
            if (p1.negate().or(p2).test(integer))
                count4++;
        }
        System.out.print("自然数的个数：" + count1 + "\n负整数的个数：" + count2 + "\n绝对值大于100的偶数的个数：" + count3 + "\n负整数或偶数的数的个数：" + count4);
    }
}