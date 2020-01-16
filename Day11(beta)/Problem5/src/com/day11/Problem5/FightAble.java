package com.day11.Problem5;

public interface FightAble{
    public abstract void specialFight();
    default void commonFight(){
        System.out.println("普通攻击");
    }
}
