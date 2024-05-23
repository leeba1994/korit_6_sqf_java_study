package com.study.java_study.ch04_제어;

public class 조건문01 {
    public static void main(String[] args) {
        // 1. if, else if, else
        // 2. switch, case, default
        // 3. continue, break
        // if 보다 삼항연산자 가능하면 삼항연산자 사용

        if(false) {
            System.out.println("참입니다.");
        } else { //else 가능하면 안씀
            System.out.println("거짓입니다.");
        }

        int num = 20;
        if(num % 2 == 0 && num % 10 == 0){
            System.out.println("짝수입니다.");

        } else {
            System.out.println("홀수입니다.");
        }


        if(num % 2 == 0) {
            System.out.println("2의 배수입니다."); //하나의 명령이면 중괄호 생략가능
            System.out.println("2의 배수입니다.");
        }

        System.out.println("------------------------");


        if(num % 2 == 0){
            System.out.println("2의 배수입니다.");
        } else if (num % 3 == 0){
            System.out.println("3의 배수입니다.");
        } else if (num % 7 == 0) {
            System.out.println("7의 배수입니다");
        } else {
            System.out.println("2의 배수도 아니고 3의 배수도 아니고 7의 배수도 아닙니다.");
        }



    }
}
