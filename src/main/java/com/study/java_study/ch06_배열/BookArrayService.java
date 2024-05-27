package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {
    public static void main(String[] args) {
        BookArrayUtils bookArrayUtils = new BookArrayUtils();

        Scanner scanner = new Scanner(System.in);
        String[] booknames =  new String[0];
        boolean isRun = true;

        while (isRun) {
            System.out.println("[도서 관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 도서 이름으로 조회");
            System.out.println("5. 전체 도서 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택: ");

            String selectedMenu = scanner.nextLine();
            String[] newbooknames = null;

            int findIndex = -1;

            switch (selectedMenu) {
                case "1":
                    System.out.println("[도서 등록]");
                    newbooknames = new String[booknames.length + 1];
                    for(int i = 0; i < booknames.length; i++) {
                        newbooknames[i] = booknames[i];
                    }
                    booknames = newbooknames;
                    newbooknames = null;
                    System.out.print("등록 할 도서 이름: ");
                    booknames[booknames.length - 1] = scanner.nextLine();
                    System.out.println(booknames[booknames.length - 1] + " 이름으로 도서 등록 완료!");

                    break;
                case "2":
                    System.out.println("[도서 이름 수정]");
                    System.out.print("수정 할 도서 이름: ");
                    String modifyName = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByBookName(booknames, modifyName);
                    if(findIndex == -1) {
                        System.out.println("해당 이름의 도서는 존재하지 않습니다.");
                        break;
                    }
                    System.out.print("변경 할 도서의 이름: ");
                    booknames[findIndex] = scanner.nextLine();
                    System.out.println(modifyName + " 에서 " + booknames[findIndex] + " 으로 수정 완료!");

                    break;
                case "3":
                    System.out.println("[도서 삭제]");
                    System.out.print("삭제 할 도서의 이름: ");
                    String removeName = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexByBookName(booknames, removeName);
                    if(findIndex == -1) {
                        System.out.println("해당 이름의 도서는 존재하지 않습니다.");
                        break;
                    }


                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "q":
                    isRun = false;
                    break;
                default:
                    System.out.println("다시 입력 해주세요");


            }

            System.out.println();


        }



    }
}
