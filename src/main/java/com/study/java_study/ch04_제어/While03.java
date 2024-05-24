package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isRun = true;

        System.out.println("프로그램 시작");

        while (isRun) {
            System.out.println("[메인 메뉴]");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 조회");
            System.out.println("3. 회원 탈퇴");
            System.out.println("q. 프로그램 종료");

            System.out.print("메뉴 선택: ");
            String selectedMenu = scanner.nextLine();

            switch (selectedMenu) {
                case "1":
                    System.out.println("회원 등록으로 들어오셨습니다");
                    break;
                case "2":
                    System.out.println("회원 조회로 들어오셨습니다");
                    boolean isRunmenu2 = true;
                    while (isRunmenu2) {
                        System.out.println("[회원 조회]");
                        System.out.println("1. 회원 번호로 조회");
                        System.out.println("2. 회원 이름으로 조회");
                        System.out.println("b. 뒤로가기");
                        System.out.println("q. 프로그램 종료");
                        System.out.print("메뉴 선택: ");
                        selectedMenu = scanner.nextLine();
                        switch (selectedMenu) {
                            case "1":
                                System.out.println("회원 번호로 조회를 합니다.");
                                boolean isRunmenu3 = true;
                                while (isRunmenu3) {
                                    System.out.println("[회원 번호 조회]");
                                    System.out.println("1. 이병안");
                                    System.out.println("2. 홍길동");
                                    System.out.println("b. 뒤로가기");
                                    System.out.println("q. 프로그램 종료");
                                    System.out.print("메뉴 선택: ");
                                    selectedMenu = scanner.nextLine();

                                    switch (selectedMenu) {
                                        case "1":
                                            System.out.println("[이병안 회원]");
                                            System.out.println("[나이: 31]");
                                            System.out.println("[연락처: 010-2480-4593]");
                                            break;
                                        case "2":
                                            System.out.println("[홍길동 회원]");
                                            System.out.println("[나이: 20]");
                                            System.out.println("[연락처: 010-2458-1234]");
                                            break;
                                        case "b":
                                            System.out.println("회원 조회 메뉴로 돌아갑니다.");
                                            isRunmenu3 = false;
                                            break;
                                        case "q":
                                            System.out.println("프로그램을 종료합니다");
                                            isRun = false;
                                            isRunmenu2 = false;
                                            isRunmenu3 = false;
                                            break;
                                        default:
                                            System.out.println("잘못된 입력입니다. 다시 입력하세요");
                                    }

                                    System.out.println();
                                }

                                break;
                            case "2":
                                System.out.println("회원 이름으로 조회를 합니다.");
                                boolean isRunmenu4 = true;

                                while (isRunmenu4) {
                                    System.out.println("[회원 이름 조회]");
                                    System.out.println("이병안. 정보");
                                    System.out.println("홍길동. 정보");
                                    System.out.println("b. 뒤로가기");
                                    System.out.println("q. 프로그램 종료");
                                    System.out.print("메뉴 선택: ");
                                    selectedMenu = scanner.nextLine();



                                    System.out.println();
                                }


                                break;
                            case "b":
                                System.out.println("메인 메뉴로 돌아갑니다.");
                                isRunmenu2 = false;
                                break;
                            case "q":
                                System.out.println("프로그램을 종료합니다");
                                isRun = false;
                                isRunmenu2 = false;
                                break;
                            default:
                                System.out.println("잘못된 입력입니다. 다시 입력하세요");
                        }
                        System.out.println();
                    }
                    break;
                case "3":
                    System.out.println("회원 탈퇴로 들어오셨습니다");
                    break;
                case "q":
                    System.out.println("프로그램을 종료합니다");
                    isRun = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요");
            }
            System.out.println();
        }


        System.out.println("프로그램 종료");


    }
}
