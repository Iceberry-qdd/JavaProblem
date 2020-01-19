package com.day8.Problem8;

import java.util.Scanner;
public class Problem8 {
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        int number1=sc1.nextInt();
        Scanner sc2=new Scanner(System.in);
        String operator=sc2.next();
        Scanner sc3=new Scanner(System.in);
        int number2=sc3.nextInt();
        switch(operator){
            case "+":System.out.println(number1+"+"+number2+"="+(number1+number2));break;
            case "-":System.out.println(number1+"-"+number2+"="+(number1-number2));break;
            case "*":System.out.println(number1+"*"+number2+"="+(number1*number2*1.0));break;
            case "/":System.out.println(number1+"/"+number2+"="+(number1/number2*1.0));break;
            case "%":System.out.println(number1+"%"+number2+"="+(number1%number2));break;
            default:System.out.println("null");
        }
    }
}
