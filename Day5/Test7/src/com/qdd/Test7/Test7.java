package com.qdd.Test7;

public class Test7 {
    public static void main(String[] args){
        int[] a={1,2,3,4,3,2,1};
        int[] b={1,2,3,4,3,2,1};
        /*System.out.print("[");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println("]");
        System.out.print("[");
        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");
        System.out.println("]");*/
        System.out.println("[1,2,3,4,3,2,1]");
        System.out.println("[1,2,3,4,3,2,1]");
        System.out.println("是否一致："+equals(a,b));
    }
    public static boolean equals(int[] s1,int[] s2){
        boolean flag=true;
        if(s1.length!=s2.length)
            flag=false;
        else
            for (int i = 0; i < s1.length; i++)
                if (s1[i] != s2[i])
                    flag = false;
        return flag;
    }
}
