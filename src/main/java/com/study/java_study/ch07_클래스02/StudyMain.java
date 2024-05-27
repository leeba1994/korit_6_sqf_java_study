package com.study.java_study.ch07_클래스02;

public class StudyMain {
    public static void main(String[] args) {
        StudyA a = new StudyA(); // 생성자 호출
        System.out.println(a); //할당된 메모리 주소 표출
        StudyA a2 = new StudyA(100, 1000);
        System.out.println(a2.num);
        System.out.println(a2.num2);
        //StudyB b = new StudyB(); //객체 생성

        //StudyA a = new StudyA(100, 1000); // 생성자 호출

        //a.num = 100;
        //a.num2 = 1000;

        StudyB b = new StudyB();
        //b.name = "이병안";   private String name;  외부클래스에서는 접근불가  내부클래스에서 접급가능
        //b.age = 31;         private int age;
        b.show();






    }
}
