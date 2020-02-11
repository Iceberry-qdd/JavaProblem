package com.day12.Problem1;

public class Problem1 {
    public static void main(String[] args) {
        showLongTime(() -> System.out.println(System.currentTimeMillis()));

    }

    private static void showLongTime(CurrentTimePrinter timePrinter) {
        timePrinter.printCurrentTime();
    }
}
