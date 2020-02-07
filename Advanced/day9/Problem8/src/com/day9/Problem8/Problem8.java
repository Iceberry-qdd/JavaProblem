package com.day9.Problem8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Problem8 {
    public static void main(String[] args) throws IOException {
        boolean flag=false;
        Properties properties=new Properties();
        FileInputStream fis=new FileInputStream("score.txt");
        properties.load(fis);
        fis.close();
        Set<String> strings=properties.stringPropertyNames();
        for(String key:strings)
            if(key.equals("lisi")) {
                FileOutputStream fos=new FileOutputStream("score.txt");
                properties.setProperty(key,"100");
                properties.store(fos,null);
                fos.close();
                flag = true;
            }
        System.out.println("是否存在："+flag);
    }
}
