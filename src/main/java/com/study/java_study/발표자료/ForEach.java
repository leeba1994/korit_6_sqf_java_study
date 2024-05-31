package com.study.java_study.발표자료;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int answer = 0;
        int numberofproblems;


        System.out.println("[구구단 게임]");


        for ( ; ; ) {
            System.out.println("문제 개수는 1 ~ 10 안에서 선택할수 있습니다.");
            System.out.print("풀 문제 개수를 입력하세여 :");

            if(!scanner.hasNextInt()) {
                System.out.println("숫자를 입력하세요");
                System.out.println();
                scanner.nextLine();
                continue;
            }

            numberofproblems = scanner.nextInt();
            scanner.nextLine();



            if (!(0 < numberofproblems && numberofproblems < 11)) {
                System.out.println("문제 개수를 잘못 입력했습니다.");
                System.out.println();
                continue;
            }
            int[] numberofproblemsarrays = new int[numberofproblems];


                int i=0;

            for (int numberofproblemsarray : numberofproblemsarrays) {
                int randomdan = random.nextInt(9) + 1;
                int randomnum = random.nextInt(9) + 1;

                numberofproblemsarray = (randomdan * randomnum);
                numberofproblemsarrays[i] = numberofproblemsarray;
                System.out.println(numberofproblemsarrays[i]);
                i++;
                System.out.println(randomdan + " X " + randomnum + "= ");
                System.out.print("정답을 입력하세요 : ");
                int result = scanner.nextInt();
                scanner.nextLine();
                if (!(numberofproblemsarray == result)) {
                    System.out.println("틀렸습니다");
                    continue;
                }
                System.out.println("정답 입니다");
                answer++;
            }

            System.out.println();
            System.out.println("정답 맞춘 수 : " + answer);
            System.out.println(Arrays.toString(numberofproblemsarrays));

            break;
        }
    }
}