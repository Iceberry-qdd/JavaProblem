package com.day5.Problem8;

public class Student{
    private int number;
    private String name;
    private double score;
    public Student(){};
    public Student(int number,String name,double score){
        this.number=number;
        this.name=name;
        this.score=score;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
}
