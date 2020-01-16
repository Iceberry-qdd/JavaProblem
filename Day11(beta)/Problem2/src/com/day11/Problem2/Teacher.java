package com.day11.Problem2;

public class Teacher{
    private String name;
    public Teacher(){};
    public Teacher(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void check(Student s,int attendance){
        s.setAttendance(attendance);
    }
}
