package com.day8.Problem9;

public class Problem9 {
    public static void main(String[] args){
        String key=new String("qweRY123");
        boolean flag1=false,flag2=false,flag3=true,flag4=false;
        int n=0;
        if(key.length()>=8)
            flag1=true;
        for(int i=0;i<key.length();i++) {
            if (key.charAt(i) >= 'A' && key.charAt(i) <= 'Z')
                n++;
            if (key.charAt(i)<'0'||(key.charAt(i)>'9'&&key.charAt(i)<'A')||(key.charAt(i)>'Z'&&key.charAt(i)<'a')||(key.charAt(i)>'z'))
                flag3=false;
        }
        if(n>=2)
            flag2=true;
        if(flag1&&flag2&&flag3)
            flag4=true;
        System.out.println(key+" 密码是否合法："+flag4);
    }
}
