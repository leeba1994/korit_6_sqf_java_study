package com.study.java_study.ch02_클래스01;

public class ObjectMain {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);

        // ObjectA objectA;
        ObjectA objectA1 = new ObjectA(); //1. 변수 이름은 무조건 소문자로 시작  2. 주소가 100번
        ObjectA objectA2 = new ObjectA(); // 주소가 200번 메모리 주소를 할당 할당할떄마다 메모리 추가됨
        //objectA1 는 객체
       // final  ObjectA objectA3 = new ObjectA();
        System.out.println("------------------------------------");
        System.out.println(objectA1);

        System.out.println(objectA2);

        System.out.println("------------------------------------");

        objectA1.num = 20;
        objectA2.num = 30;

        System.out.println(objectA1.num);
        System.out.println(objectA2.num);
        System.out.println(objectA1.name);
        //null 데이터크기가없는 제일앞주소에 저장됨
        System.out.println("------------------------------------");
        //클래스는 C언어에서 구조체 였다 자바에서 구조체,함수를 포함



    }
}
