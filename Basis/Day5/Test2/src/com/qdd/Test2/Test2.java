package com.qdd.Test2;

public class Test2 {
    public static void main(String[] args){
        String[] hs=new String[]{"黑桃","红桃","梅花","方片"};
        //int[] ds=new int[]{1,2,3,4,5,6,7,8,9,10,'J','Q','K'};
        String[] ds=new String[]{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for(int i=0;i<hs.length;i++)
        {
            for (int j = 0; j < ds.length; j++)
                System.out.print(hs[i] + ds[j] + " ");
            System.out.println();
        }
    }
}