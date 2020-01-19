package com.day11.Problem5;

public class Problem5 {
    public static void main(String[] args){
        System.out.println("选择：法力角色");
        Player p1=new Player();
        p1.select("法力角色").specialFight();
        p1.select("法力角色").commonFight();
        System.out.println("=================");
        System.out.println("选择：武力角色");
        Player p2=new Player();
        p2.select("武力角色").specialFight();
        p2.select("武力角色").commonFight();
    }
}
