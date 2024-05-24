package com.study.java_study.ch05_입력;

import java.util.Scanner;

//scanner.nextInt(); //숫자 리턴
//String a = scanner.next(); //문자열 리턴

public class 입력01 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        /*
            next() 메소드 특징
            1. 공백(스페이스)과 줄바꿈(엔터)는 무시한다.
            2. 버퍼를 사용한다. , 공백(스페이스)과 줄바꿈(엔터)로 버퍼를 나눔, ex) 10 20엔터
            버퍼개념 한번에 다량의 데이터를 넣는다


            nextLine()
            1. 공백(스페이스)과 줄바꿈(엔터)는 포함한다.

         */
        //String a = scanner.next();

        String a = scanner.next();
        System.out.println("에이: " + a);


        System.out.print("b: ");
        String b = scanner.nextLine();
        System.out.println("비: " + b);



    }
}
