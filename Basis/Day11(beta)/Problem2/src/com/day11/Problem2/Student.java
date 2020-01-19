package com.day11.Problem2;

public class Student{
    private String name;
    private int attendance;//0-上课，1-旷课
    public Student(){};
    public Student(String name,int Attendance){
        this.name=name;
        this.attendance=Attendance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAttendance() {
        return attendance;
    }
    public void setAttendance(int attendance) {
        attendance = attendance;
    }
}
