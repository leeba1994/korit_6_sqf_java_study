package com.study.java_study.ch08_클래스03;

import com.study.java_study.ch06_배열.ArrayUtils;

import java.util.Scanner;

public class BankbookMain {
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        Bankbook[] bankbooks = new Bankbook[0];
        Scanner scanner = new Scanner(System.in);

        boolean isRun = true;

        while (isRun) {
            System.out.println("[**은행]");
            System.out.println("1. 계좌등록");
            System.out.println("2. 계좌 전체 조회");
            System.out.println("3. 금액 입금");
            System.out.println("4. 금액 출금");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택: ");

            String selectedMenu = scanner.nextLine();
            Bankbook[] newbankbooks = new Bankbook[0];
            int findIndex = -1;



        }



    }
}
