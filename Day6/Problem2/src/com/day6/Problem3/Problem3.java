package com.day6.Problem3;

public class Problem3 {
    public static void main(String[] args) {
        MyDate d = new MyDate(1900, 1, 1);
        System.out.print("日期：");
        d.showDate();
        if(d.isBi())
            System.out.println(d.getYear()+"年是闰年");
        else
            System.out.println(d.getYear()+"年不是闰年");
    }
}
