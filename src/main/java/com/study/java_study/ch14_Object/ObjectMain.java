package com.study.java_study.ch14_Object;

import java.util.Objects;

/*
        Object 클래스(최상위 클래스) 모든클래스는 Object클래스를 상속받았다


 */
public class ObjectMain {
    public static void main(String[] args) {
        Object object = new Object();
        Student student = new Student("이병안", 31);
        Student student2 = new Student("이병안", 31);
        //Student student3 = new Object();

        Student[] students = new Student[3];
        students[0]= new Student("이병안", 31);
        //students[1]= new Object();


        Object[] objects = new Object[3];
        objects[0] = new Object();
        //objects[0] = objects[2];
        objects[1] = "test";
        objects[2] = new Student("이병안", 32);
        objects[2] = objects[0];

        System.out.println(student.toString());     //.toString() 생략가능 변수명만 입력해도 .toString()메소드 사용
        System.out.println(student);     //.toString() 생략가능 변수명만 입력해도 .toString()메소드 사용
        String str = "데이터";
        String str2 = new String("데이터");
        System.out.println(str);
        System.out.println(str2);

        //String studentData = student;
        String studentData = student.toString();
        System.out.println(studentData);


        System.out.println(student.equals(student2));       //값 비교

        System.out.println(student.hashCode());     //주소값 출력
        System.out.println(student2.hashCode());    //주소값 출력


        System.out.println(student.hashCode() == student2.hashCode()); //true 나오게 하고싶다
        System.out.println(Objects.hash("이병안"));
        System.out.println(Objects.hash("이병안"));

        
    }
}
