package com.day3.Problem5;

import java.util.LinkedList;
public class Problem5 {
    public static void main(String[] args){
        LinkedList<String> link=new LinkedList<>();
        basicMethod(link);
        System.out.println("=======================");
        specialMethod(link);
    }
    public static void basicMethod(LinkedList<String> link){//练习基本方法
        link.add("戴佩妮");
        link.add("迪丽热巴");
        link.add("花泽香菜");
        link.add("鞠婧祎");
        link.add("邓紫棋");
        link.add("金珠美");
        link.add("欧阳娜娜");
        link.set(0,"陈粒");
        System.out.println("今天选："+link.get(2));
        System.out.println("抛弃："+link.remove(3));
        System.out.println("我女神有"+link.size()+"个");
        link.clear();
        System.out.println("喜欢我的女神有"+link.size()+"个");
    }
    public static void specialMethod(LinkedList<String> link){//练习特有方法
        link.addFirst("戴佩妮");
        link.addLast("迪丽热巴");
        link.addLast("花泽香菜");
        link.addLast("鞠婧祎");
        link.addLast("邓紫棋");
        link.addLast("金珠美");
        link.addLast("欧阳娜娜");
        link.addLast("陈粒");
        System.out.println("排在第一位的是："+link.getFirst());
        System.out.println("排在最后一位的是："+link.getLast());
        System.out.println("第一个被我抛弃了，她是："+link.removeFirst());
        System.out.println("最后一个也被我抛弃了，她是："+link.removeLast());
        link.push("Taylor Swift");
        System.out.println("今天选："+link.pop());
        link.clear();
        System.out.println("喜欢我的女神有"+link.size()+"个\n");
    }
}
