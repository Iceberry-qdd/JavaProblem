package com.day9.Problem3;

public class Duck extends Poultry{
    public Duck(){}
    public Duck(String name,String symptom,int age,String illness){
        setName(name);
        setSymptom(symptom);
        setAge(age);
        setIllness(illness);
    }
    public void showSymptom(){
        System.out.println("症状为："+getSymptom());
    }
        }
