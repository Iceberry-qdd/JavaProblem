package com.day1.Problem7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Problem7 {
    public static void main(String[] args){
        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.YEAR,2018);
        cal.set(Calendar.MONTH,2);
        cal.set(Calendar.DAY_OF_MONTH,14);
        Date date=cal.getTime();
        DateFormat df=new SimpleDateFormat("E");
        String str=df.format(date);
        System.out.println(str);
    }
}
