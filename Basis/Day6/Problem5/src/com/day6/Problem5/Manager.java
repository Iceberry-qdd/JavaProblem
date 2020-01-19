package com.day6.Problem5;

public class Manager{
    private String name;
    private String number;
    private double wage;
    private double bonus;
    public Manager(){};
    public Manager(String name,String number,double wage,double bonus){
        this.name=name;
        this.number=number;
        this.wage=wage;
        this.bonus=bonus;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public String getNumber(){
        return number;
    }
    public void setNumber(){
        this.number=number;
    }
    public double getWage(){
        return wage;
    }
    public void setWage(){
        this.wage=wage;
    }
    public double getBonus(){
        return bonus;
    }
    public void setBonus(){
        this.bonus=bonus;
    }
    public void intro(){
        System.out.println("经理姓名："+name);
        System.out.println("工号："+number);
    }
    public void showSalary(){
        System.out.print("基本工资为"+wage);
        System.out.println("，奖金为"+bonus);
    }
    public void work(){
        System.out.println("正在努力的做着管理工作，分配任务，检查员工提交上来的代码");
    }
}
