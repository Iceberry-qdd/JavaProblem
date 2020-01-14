package com.day9.Problem4;

public class Student extends Person{
        private double score;
        public Student(){}
        public Student(String name,int age,double score){
            setName(name);
            setAge(age);
            this.score=score;
        }
        public double getScore() {
            return score;
        }
        public void setScore(double score) {
            this.score = score;
        }
        public void showMsg(){
            System.out.println(getName()+"同学，考试得了："+score+"分");
        }
}
