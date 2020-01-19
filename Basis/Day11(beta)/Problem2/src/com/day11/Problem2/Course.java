package com.day11.Problem2;

import java.util.ArrayList;
public class Course{
    private String name;
    private Teacher teacher;
    private ArrayList<Student> list;//学生集合
    public Course(){};
    public Course(String name,Teacher teacher,ArrayList<Student> list){
        this.name=name;
        this.teacher=teacher;
        this.list=list;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTeacher() {
        return teacher.getName();
    }
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public ArrayList<Student> getList() {
        return list;
    }
    public void setList(ArrayList<Student> list) {
        this.list = list;
    }
    public void show(){
        System.out.println("课程名称："+getName());
        System.out.println("授课老师："+getTeacher());
        for(int i=0;i<list.size();i++)
            if(list.get(i).getAttendance()==0)
                System.out.println("上课："+list.get(i).getName());
            else if(list.get(i).getAttendance()==1)
                System.out.println("旷课："+list.get(i).getName());
            else
                System.out.println("未知："+list.get(i).getName());
    }
}
