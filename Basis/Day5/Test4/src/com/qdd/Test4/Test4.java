package com.qdd.Test4;

public class Test4 {
    public static void main(String[] args) {
        char[] array_chars=new char[]{'a','l','f','m','f','o','b','b','s','n'};//[v2.0]改变量名a为array_chars[2020-1-17]
        printCount(array_chars);
    }
    public static void printCount(char[] array_chars){
        int[] array_counts = new int[26];//[v2.0]改变量名b为array_counts[2020-1-17]
        for(int i=0;i<array_chars.length;i++) {
            int j = (int)array_chars[i] - 97;
            array_counts[j]++;
        }
        for(int i=0;i<array_counts.length;i++)
            if(array_counts[i]!=0) {
                char c= (char) (i+97);
                System.out.println(c+"--"+array_counts[i]);
            }
    }
}