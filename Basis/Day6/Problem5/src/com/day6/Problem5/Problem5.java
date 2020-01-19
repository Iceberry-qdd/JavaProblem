package com.day6.Problem5;

public class Problem5 {
    public static void main(String[] args){
        Manager m=new Manager("James","9527",15000,3000);
        Coder c=new Coder("Kobe","0025",10000);
        m.intro();
        m.showSalary();
        m.work();
        System.out.println("============");
        c.intro();;
        c.showSalary();
        c.work();
    }
}
