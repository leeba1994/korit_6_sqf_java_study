package com.study.java_study.발표자료;

import java.util.Random;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {        //메인 메소드
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int answer = 0;
        System.out.println("[구구단 게임] 10문제 맞추기");              //[구구단] 문자열 출력



        for (int i = 0; i < 10; i++) {
            int randomnum = random.nextInt(9)+1;        //랜덤 0~9 숫자에서 1을 더한 값 을 randomnum 담는다
            int randomdan = random.nextInt(9)+1;        //랜덤 0~9 숫자에서 1을 더한 값 을 randomdan 담는다
            System.out.println(randomdan + " X " + randomnum + "= ");
            System.out.print("정답을 입력하세요 : ");
            int result = scanner.nextInt();
            scanner.nextLine();
            if (!(randomdan * randomnum == result)) {
                System.out.println("틀렸습니다");
                continue;
            }
            System.out.println("정답 입니다");
            answer++;
        }
        System.out.println("정답 맞춘 수 : " + answer);

    }


}

