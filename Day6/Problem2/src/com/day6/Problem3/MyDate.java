package com.day6.Problem3;

public class MyDate{
    private int year;
    private int month;
    private int day;
    public MyDate(int year, int month, int day) {
        this.year=year;
        this.month=month;
        this.day=day;
    }
    public int getYear(){
        return year;
    }
    public void setYear(){
        this.year=year;
    }
    public int getMonth(){
        return month;
    }
    public void setMonth(){
        this.month=month;
    }
    public int getDay(){
        return day;
    }
    public void setYDay(){
        this.day=day;
    }
    public void showDate(){
        System.out.println(year+"年"+month+"月"+day+"日");
    }
    public boolean isBi(){
        if((year%4==0&&year%100!=0)||(year%100==0&&year%400==0))
            return true;
        else return false;
    }
}
