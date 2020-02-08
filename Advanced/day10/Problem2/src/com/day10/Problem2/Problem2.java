package com.day10.Problem2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem2 {
    public static void main(String[] args) throws FileNotFoundException {
        try(
                BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\e.txt"));){
                    byte[] b="i love java".getBytes();
                    bos.write(b);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
