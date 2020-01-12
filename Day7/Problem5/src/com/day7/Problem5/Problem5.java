package com.day7.Problem5;

import java.util.Random;
import java.util.ArrayList;
public class Problem5 {
    public static void main(String[] args){
        /*for(int i=0;i<50;i++)
        {
            System.out.println(getScoreList());
        }*/
        printCount(countScore(getScoreList()));
    }
    public static ArrayList<Double> getScoreList(){
        Random r=new Random();
        ArrayList<Double> list=new ArrayList<>();
        for(int i=0;i<50;i++){
            double score=r.nextDouble()*100.0;
            list.add(score);
        }
        return list;
    }
    public static int[] countScore(ArrayList<Double> list){
        int[] count=new int[4];
        for(int i=0;i<list.size();i++)
            if(list.get(i)>=0&&list.get(i)<40)
                count[0]++;
            else if(list.get(i)>=40&&list.get(i)<60)
                count[1]++;
            else if(list.get(i)>=60&&list.get(i)<80)
                count[2]++;
            else if(list.get(i)>=80&&list.get(i)<=100)
                count[3]++;
            return count;
    }
    public static void printCount(int[] count){
        System.out.println("100分--80分："+count[3]+"人");
        System.out.println("79分--860分："+count[2]+"人");
        System.out.println("59分--40分："+count[1]+"人");
        System.out.println("39分--0分："+count[0]+"人");
    }
}
