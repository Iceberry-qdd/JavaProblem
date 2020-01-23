package com.day5.Problem8;

public class Problem8 {
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "joe", 98);
            Student student2 = new Student(2, "kitty", -36);
            checkStudentScore(student1);
            System.out.println(student1.getNumber()+"-"+student1.getName()+"-"+student1.getScore());
            checkStudentScore(student2);
            System.out.println(student2.getNumber()+"-"+student2.getName()+"-"+student2.getScore());
        } catch (RegisterException e) {
            e.printStackTrace();
        }
    }
    public static boolean checkStudentScore(Student student) throws RegisterException {
        if(student.getScore()<0)
            throw new RegisterException("分数不能为负数！");
        return true;
    }
}
