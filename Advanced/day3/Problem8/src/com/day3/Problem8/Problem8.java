package com.day3.Problem8;

import java.util.Iterator;
import java.util.LinkedHashSet;
public class Problem8 {
    public static void main(String[] args){
        LinkedHashSet<String> link=new LinkedHashSet<>();
        link.add("王昭君");
        link.add("王昭君");
        link.add("西施");
        link.add("杨玉环");
        link.add("貂蝉");
        Iterator<String> it=link.iterator();
        System.out.println("迭代器遍历：");
        while(it.hasNext())
           System.out.print(it.next()+" ");
        System.out.println("\n增强for遍历");
        for(String str:link)
            System.out.print(str+" ");
    }
}
