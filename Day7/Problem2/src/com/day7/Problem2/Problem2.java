package com.day7.Problem2;

import java.util.Scanner;
import java.util.ArrayList;
public class Problem2 {
    public static void main(String[] args){
        ArrayList<Student> student=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("1.录入信息 0.退出");
        int choice=sc.nextInt();
        while(choice==1) {
            System.out.println("请输入姓名：");
            String name=sc.next();
            System.out.println("请输入年龄：");
            int age=sc.nextInt();
            Student s=new Student(name,age);
            student.add(s);
            System.out.println("1.录入信息 0.退出");
            choice=sc.nextInt();
        }
        System.out.println("录入完毕");
        for(int i=0;i<student.size();i++){
            System.out.println("学生姓名="+student.get(i).getName()+"，年龄="+student.get(i).getAge());
        }
    }
}
