package com.dya11.Problem3;

import java.util.ArrayList;
public class Problem3 {
    public static void main(String[] args) {
        User[] user = new User[50];
        for (int i = 0; i < 50; i++)
            user[i]= new User("A", i+1);
        Receptionist r1 = new Receptionist();
        Receptionist r2 = new Receptionist();
        Receptionist r3 = new Receptionist();

        /*Filter f2=new Filter() {
            @Override
            public void filterUser (User u){
                r2.doFilter(u, 20, 29, "v1");
            }
        };
        Filter f3=new Filter() {
            @Override
            public void filterUser (User u){
                r3.doFilter(u, 1, 50, "A");
            }
        };*/
        for(int i=0;i<user.length;i++) {
            User u=new User();
            u=user[i];
            if(user[i].getId()>=10&&user[i].getId()<=19)
                //r3.setFilter(f3);
                /*Filter f1 = new Filter() {
                    @Override
                    public void filterUser(User u) {
                        r1.doFilter(u, 10, 19, "v1");
                    }
                };*/
                //r1.setFilter(f1);
                r1.doFilter(u, 10, 19, "v1");

            else if(user[i].getId()>=20&&user[i].getId()<=29)
                r2.doFilter(u, 20, 29, "v2");
        }
        System.out.println("未分组：");
        Print1(user);
        System.out.println("已分组：");
        Print2(user);
    }
    public static void Print1(User[] user){
        ArrayList<User> noTypeUser=new ArrayList<>();
        for(int i=0;i<user.length;i++)
            if(user[i].getType()=="A")
                noTypeUser.add(user[i]);
        System.out.print("[");
        for(int i=0;i<noTypeUser.size();i++)
            if(i!=noTypeUser.size()-1)
                System.out.print(noTypeUser.get(i).getId()+"-"+"null,");
            else
                System.out.println(noTypeUser.get(i).getId()+"-"+"null]");
    }
    public static void Print2(User[] user){
        for(int i=0;i<user.length;i++)
            if((i+1)%9==0&&i!=0)
                System.out.println(user[i].getId()+"-"+user[i].getType());
            else
                System.out.print(user[i].getId()+"-"+user[i].getType()+" ");
    }
}
