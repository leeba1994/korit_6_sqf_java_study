package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("개수: ");

        int count = scanner.nextInt();

        int i = 0;

        /*

        while (i < count) {
            if(i % 2 == 0) {
                System.out.println("짝수 입니다");
                i++;
                continue; //다음 반복으로 계속해라
            }
            System.out.println("홀수 입니다");
            i++;
        }
        */

        for (int j = 0; j < count; j++) {
            if(j % 2 == 0) {
                System.out.println("짝수 입니다");
                continue; //다음 반복으로 계속해라
            }
            System.out.println("홀수 입니다");
        }


    }
}
