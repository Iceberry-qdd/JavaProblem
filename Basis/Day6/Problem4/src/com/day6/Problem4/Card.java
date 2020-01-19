package com.day6.Problem4;

public class Card{
    private String hs;//hs:花色
    private char ds;//ds:点数
    public Card(String hs,char ds){
        this.hs=hs;
        this.ds=ds;
    }
    public void showCard(){
        System.out.println(hs+ds);
    }
}
