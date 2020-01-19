package com.day9.Problem4;

public class Teacher extends Person {
    private String subject;

    public Teacher() {
    }

    public Teacher(String name,int age,String subject) {
        setName(name);
        setAge(age);
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void showMsg() {
        System.out.println(getName() + "老师，讲授" + subject + "课");
    }
}
