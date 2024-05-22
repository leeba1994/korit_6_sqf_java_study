package com.study.java_study.ch02_클래스01;

public class StudentMain {
    public static void main(String[] args) {
       /* String name = "이병안";
        int age = 30;
        String name2 = "홍길동";
        int age2 = 24; */
        Student student1 = new Student(); //학생1 객체를 생성한다
        Student student2 = new Student(); //학생2 객체를 생성한다

        student1.name = "이병안"; //클래스에 맴버변수 및 속성
        student1.age = 29;
        student2.name = "홍길동";
        student2.age = 13;
    }
}
