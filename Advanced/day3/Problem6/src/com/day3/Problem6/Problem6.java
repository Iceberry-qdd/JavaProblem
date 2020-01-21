package com.day3.Problem6;

import java.util.HashSet;
public class Problem6 {
    public static void main(String[] args){
        Person person1=new Person("张三",25);
        Person person2=new Person("李四",12);
        Person person3=new Person("王五",36);
        Person person4=new Person("张三",25);
        HashSet<Person> set=new HashSet<>();
        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person4);
        for(Person person:set)
            System.out.println(person);
    }
}
