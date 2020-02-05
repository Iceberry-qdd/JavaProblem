package com.day7.Problem9;

public class Problem9 {
    public static void main (String[] args) {
        // TODO 请使用 Lambda 【省略格式】 调用 invokeDirect方法
        invokeDirect(() -> {
            System.out.println("导演拍电影啦！");
        });
    }
    private static void invokeDirect (Director director) {
        director.makeMovie();
    }
}
