package com.qdd.Test5;

public class Test5 {
    public static void main(String[] args){
        double[] score=new double[]{95,92,75,56,98,71,80,58,91,91};
        int i,n=0;
        double Avg=getAvg(score);
        for(i=0;i<score.length;i++)
            if(score[i]>Avg)
                n++;
        System.out.println("高于平均分"+Avg+"的个数有："+n+"个");
    }
    public static double getAvg(double[] s){
        double sum=0;
        for(int i=0;i<s.length;i++)
        {
            sum+=s[i];
        }
        return sum/s.length;
    }
}
