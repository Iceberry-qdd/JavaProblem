package com.day7.Problem6;

public class Problem6 {
    public int start = 1;
    public int end = 99;
    public static void main (String[] args) {
        new Problem6().method();
    }
    public void method() {
        // TODO 请在此处 插入代码 ，实现功能
        Runnable a=new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=99;i++)
                    System.out.print(i+" ");
            }
        };
        //
        Thread t = new Thread( a );
        t.start();
    }
}
/*使用lambda表达式
Runnable a= () -> {
            for(int i=start;i<=end;i++)
                System.out.print(i+" ");
        };

 */