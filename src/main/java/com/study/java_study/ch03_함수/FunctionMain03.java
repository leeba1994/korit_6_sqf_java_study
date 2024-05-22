package com.study.java_study.ch03_함수;

public class FunctionMain03 {
    public static void main(String[] args) {
        Function03 fx = new Function03();
        Student student = new Student();
        Student student2 = new Student();

        student.studentCode = 15;
        student.name = "이병안";
        student.age = 20;
        student.phone = "01012345678";

        student2.studentCode = 12;
        student2.name = "홍길동";
        student2.age = 19;
        student2.phone = "01612345678";

        fx.fx01(1234, "김준일", 31, "01099881916");

        fx.fx02(student);
        fx.fx02(student2);
    }
}
