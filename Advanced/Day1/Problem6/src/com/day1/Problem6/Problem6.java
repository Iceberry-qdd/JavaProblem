package com.day1.Problem6;

import java.text.*;
import java.util.Date;
public class Problem6 {
    public static void main(String[] args) throws ParseException{
        DateFormat df1=new SimpleDateFormat("yyyy-MM-dd");
        String str1="2018-03-04";
        Date date=df1.parse(str1);
        DateFormat df2=new SimpleDateFormat("yyyy年MM月dd日");
        String str2=df2.format(date);
        System.out.println(str2);
    }
}
