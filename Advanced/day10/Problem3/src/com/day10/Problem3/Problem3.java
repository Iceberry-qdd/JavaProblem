package com.day10.Problem3;

import java.io.*;

public class Problem3 {
    public static void main(String[] args) throws FileNotFoundException{
        long start=System.currentTimeMillis();
        try(
                BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\c.png"));
                BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("D:\\c.png"));){
            int length;
            byte[] bytes=new byte[8*1024];
            while ((length=bis.read(bytes))!=-1){
                bos.write(bytes,0,length);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        long end=System.currentTimeMillis();
        System.out.println("缓冲流使用数组复制时间："+(end-start)+"毫秒");
    }
}
