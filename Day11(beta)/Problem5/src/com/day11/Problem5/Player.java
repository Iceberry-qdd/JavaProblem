package com.day11.Problem5;

public class Player{
    Fighter fighter=new Fighter();
    Mage mage=new Mage();
    public FightAble select(String str){
        FightAble temp = null;
        if(str=="法力角色")
            temp=fighter;
        else if(str=="武力角色")
            temp=mage;
        return temp;
    }
}
