package com.study.java_study.ch04_제어;

import java.util.Random;
import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        /*
        해당 조건이 만족하면 멈춤
        1~ 5까지
         */

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        //탈출 조건문 생성
        int num = random.nextInt(5); //스캐너 nextInt() 랑 역할 다름, 0 ~ 9까지 중 랜덤 숫자 범위지정

        while (true) {
            System.out.print("입력: ");
            int data = scanner.nextInt();
            if(num == data) {
                System.out.println("정답은 " + data + "입니다.");
                break;
            }
            System.out.println("틀렸습니다. 다시 입력하세요");
        }



    }
}
