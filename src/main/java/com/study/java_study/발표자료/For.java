package com.study.java_study.발표자료;

import java.util.Random;    // Random 클래스를 임포트합니다.
import java.util.Scanner;   // Scanner 클래스를 임포트합니다.

public class For {  // 클래스 선언
    public static void main(String[] args) {    // 메인 메서드 선언
        Scanner scanner = new Scanner(System.in);   // 입력을 위한 Scanner 객체를 생성합니다.
        Random random = new Random();   // 랜덤 숫자 생성을 위한 Random 객체를 생성합니다.
        int answer = 0; // 정답 수를 저장할 변수입니다.

        int numberofproblems = 0;   // 사용자가 선택한 문제 수를 저장할 변수입니다
        System.out.println("[구구단 게임]"); // 게임 제목을 출력합니다.

        // 명시적으로 탈출할 때까지 게임을 유지하기 위한 무한 루프입니다.
        for ( ; ; ) {
            System.out.println("문제 개수는 1 ~ 10 안에서 선택할수 있습니다."); // 사용자에게 문제 수를 선택하라는 메시지를 출력합니다.
            System.out.print("풀 문제 개수를 입력하세여 :");   // 사용자로부터 문제 수를 입력하라는 메시지를 출력합니다.
            numberofproblems = scanner.nextInt();   // 사용자로부터 입력을 받습니다.
            scanner.nextLine(); // 개행 문자를 소비합니다.

            // 문제 수 입력값의 유효성을 검사합니다.
            if(!(0 < numberofproblems && numberofproblems < 11)) {
                System.out.println("문제 개수를 잘못 입력했습니다.");    // 잘못된 입력에 대한 오류 메시지를 출력합니다.
                System.out.println();
                continue;   // 다시 사용자에게 문제 수를 입력하도록 루프를 재시작합니다.
            }

            // 지정된 개수의 문제를 생성하고 풉니다.
            for (int i = 0; i < numberofproblems; i++) {
                int randomnum = random.nextInt(9) + 1;  // 1부터 9까지의 랜덤한 숫자를 생성합니다.
                int randomdan = random.nextInt(9) + 1;  // 1부터 9까지의 랜덤한 숫자를 생성합니다.
                System.out.println();
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
            System.out.println();
            System.out.println("정답 맞춘 수 : " + answer);
            break;

        }


    }


}

