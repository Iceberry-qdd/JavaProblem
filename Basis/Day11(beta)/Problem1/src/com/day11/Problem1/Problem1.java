package com.day11.Problem1;

public class Problem1 {
    public static void main(String[] args){
        String str=new String("23.23456789");
        HandleAble ha=new HandleAble() {//创建匿名类对象，重写所有抽象方法
            @Override
            public void HandleString(String num) {
                System.out.printf("取整后：%d%n", (int)Double.parseDouble(num));//(int)Double.parseDouble(num):把数字类型的字符串，转换成double类型,再强制转换为int类型
                System.out.printf("保留4位小数后：%.4f%n",Double.parseDouble(num));//%.4f:按四舍五入规则保留4位小数
            }
        };
        System.out.println("原数字："+str);
        ha.HandleString(str);
    }
}
