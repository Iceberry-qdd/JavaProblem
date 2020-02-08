package com.day10.Problem1;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem1 {
    public static void main(String[] args) throws FileNotFoundException {
        try(
                BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\d.txt"));
        ){
            byte b='b';
            bos.write(b);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
