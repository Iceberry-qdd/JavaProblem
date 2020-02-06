package com.day8.Problem1;

import java.io.File;
import java.io.IOException;

public class Problem1 {
    public static void main(String[] args) throws IOException {
        String pathname1="D:\\Lenovo\\Documents\\IdeaProjects\\advanced\\day8\\Problem1\\file1.txt";
        File file1=new File(pathname1);
        String pathname2="file2.txt";
        File file2=new File(pathname2);
        file1.createNewFile();
        file2.createNewFile();
    }
}
