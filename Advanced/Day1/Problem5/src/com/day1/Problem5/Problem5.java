package com.day1.Problem5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Problem5 {
    public static void main(String[] args){
        Date date=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str=df.format(date);
        System.out.println(str);
    }
}
