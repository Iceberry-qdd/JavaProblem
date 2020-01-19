package com.day11.Problem2;

import java.util.ArrayList;
public class Problem2 {
    public static void main(String[] args){
        Student s1=new Student("小红",0);
        Student s2=new Student("小亮",0);
        Student s3=new Student("小明",1);
        ArrayList<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        Teacher teacher=new Teacher("张老师");
        teacher.check(s1,0);
        teacher.check(s2,0);
        teacher.check(s3,1);
        Course course=new Course("Java",teacher,list);
        course.show();
    }
}
