package com.day6.Problem6;

public class Problem6 {
        public static void main(String[] args) {
            Teacher t = new Teacher("周老师", 30, "java面向对象");
            Student s = new Student("韩同学", 18, "java面向对象");
            System.out.println("年龄为" + t.getAge() + "的" + t.getName() + "正在" + t.eat() + "……");
            System.out.println("年龄为" + t.getAge() + "的" + t.getName() + "正在" + t.teach() + t.getContent() + "的知识……");
            System.out.println("年龄为" + s.getAge() + "的" + s.getName() + "正在" + s.eat() + "……");
            System.out.println("年龄为" + s.getAge() + "的" + s.getName() + "正在" + s.study() + s.getContent() + "的知识……");
        }
}
