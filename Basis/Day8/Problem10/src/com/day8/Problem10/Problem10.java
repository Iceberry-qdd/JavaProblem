package com.day8.Problem10;

import java.util.ArrayList;
import java.util.Scanner;
public class Problem10 {
    public static void main(String[] args){

        User user1=new User("jack","1234");
        User user2=new User("rose","5678");
        User user3=new User("tom","0000");
        ArrayList<User> users=new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        for(int i=0;i< users.size();i++)
            System.out.println(users.get(i).getName()+'-'+users.get(i).getKey());
        System.out.println("请输入用户名");
        Scanner sc1=new Scanner(System.in);
        String name=sc1.next();
        System.out.println("请输入密码");
        Scanner sc2=new Scanner(System.in);
        String key=sc2.next();
        System.out.print("登录结果：");
        boolean flag1=false,flag2=false;
        for(int i=0;i<users.size();i++) {
            if (!users.get(i).getName().equals(name))//Java的if语句中==判断的是内存是否为同一个内存地址，equal判断的是对象是否是同一个对象
                continue;
            else
                flag1 = true;
            if (users.get(i).getKey().equals(key))
                flag2 = true;
            break;
        }
        /*[v1.0]
        if(flag1!=true)
            System.out.println("没有该用户");
        else if(flag2==false)
            System.out.println("密码错误");
        else
            System.out.println("登陆成功");*/

        //[v2.0]精简if语句[2020-1-17]
        if(!flag1)
            System.out.println("没有该用户");
        else if(!flag2)
            System.out.println("密码错误");
        else
            System.out.println("登录成功");
    }
}
