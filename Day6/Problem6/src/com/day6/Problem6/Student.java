package com.day6.Problem6;

public class Student{
        private  String name;
        private  int age;
        private  String content;
        public Student(String name,int age,String content){
            this.name=name;
            this.age=age;
            this.content=content;
        }
        public String eat(){
            return "吃饭";
        }
        public String study(){
            return "亢奋的讲着";
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public String getContent() {
            return content;
        }
}
