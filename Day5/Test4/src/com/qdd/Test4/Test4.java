package com.qdd.Test4;

public class Test4 {
    public static void main(String[] args) {
        char[] a=new char[]{'a','l','f','m','f','o','b','b','s','n'};
        //String[] a = new String[]{"a", "l", "f", "m", "f", "o", "b", "b", "s", "n"};
        printCount(a);
    }
    public static void printCount(char[] a){
        int[] b = new int[26];
        for(int i=0;i<a.length;i++) {
            //int j=(int)a.charAt(a[i])+1;
            int j = (int)a[i] - 97;
            //int j = Integer.parseInt(a[i]) - 97;
            b[j]++;
        }
        for(int i=0;i<b.length;i++)
            if(b[i]!=0) {
                char c= (char) (i+97);
                //String c=String.valueOf(i)+'a';
                System.out.println(c+"--"+b[i]);
            }
    }
}