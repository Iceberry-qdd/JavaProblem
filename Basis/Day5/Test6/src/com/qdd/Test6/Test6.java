package com.qdd.Test6;

public class Test6 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 3, 2, 1};
        int[] b = {1, 2, 3, 4, 5, 2, 1};
        System.out.println("[1,2,3,4,3,2,1]是否对称：" + sym(a));
        System.out.println("[1,2,3,4,5,2,1]是否对称：" + sym(b));
    }
    public static boolean sym(int[] s) {
        //int min=0;
        //int max=s.length-1;
        boolean flag = true;
        for (int min = 0, max = s.length - 1; min <= max; min++, max--)
            if (s[min] != s[max]) {
                flag = false;
                break;
            }
        return flag;
    }
}