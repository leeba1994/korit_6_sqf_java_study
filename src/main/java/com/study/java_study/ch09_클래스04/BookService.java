package com.study.java_study.ch09_클래스04;

import java.util.Scanner;

public class BookService {

    private Scanner scanner;
    private BookRepository bookRepository;

    public BookService() {  //BookService 객체가 생성 후 (scanner,bookRepository)안에 new Scanner(System.in); 및 new BookRepository(); 주소를 담는다
        scanner = new Scanner(System.in);
        bookRepository = new BookRepository();
    }

    private String selectMenu() {
        String menus = "1234q";
        String selectMenu = null;

        while (true) {
            System.out.print("메뉴 선택: ");
            selectMenu = scanner.nextLine();
            if (menus.contains(selectMenu)) {
                break;
            }
            System.out.println("잘못된 입력입니다. 다시 입력하세요.");
        }

        return selectMenu;
    }


    public boolean run() {
        boolean isRun = true;

        System.out.println("[ 도서 관리 프로그램 ]");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 검색");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("5. 삭제된 도서 검색");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectMenu();     //selectMenu(); 호출해서 리턴값을 selectedMenu 담는다.

        switch (selectedMenu) {
            case "q":
                isRun = false;
                break;
            case "1":
                registerBook();
                break;
            case "2":
                search();
                break;
            case "3":
                modify();
                break;
            case "4":
                remove();
                break;
            default:
                System.out.println("입력 오류");
        }
        System.out.println();

        return isRun;

    }

    private String validateValus(String title) {
        String valus = null;
        while (true) {
            System.out.print(title + "명 입력: ");
            valus = scanner.nextLine();
            if (!valus.isBlank()) {        //.isBlank() -> 해당 문자열이 뛰어쓰기 및 공백 확인 해서 공백이 아니면 빠져나감, !낫 연산자 부정 공백이 아니여야한다
                break;
            }
            System.out.println(title + "명은 공백일 수 없습니다. 다시입력하세요.");
        }
        return valus;
    }

    private String duplicateBookName() {
        String bookName = null;
        while (true) {
            bookName = validateValus("도서");
            if (bookRepository.findBookByBookName(bookName) == null) {
                break;
            }
            System.out.println("해당 도서명이 이미 존재합니다. 다시입력하세요");
        }
        return bookName;
    }


    private void registerBook() {
        System.out.println("[ 도서 등록 ]");
        int bookId = bookRepository.autoIncrementBookID();
        String bookNane = duplicateBookName();
        String author = validateValus("저자");
        String publisher = validateValus("출판사");

        BookEntity book = new BookEntity(bookId, bookNane, author, publisher);
        bookRepository.saveBook(book);
        System.out.println("새로운 도서를 등록하였습니다.");
    }

    private void search() {
        System.out.println("[ 도서 검색 ]");
        System.out.println("1. 통합 검색");
        System.out.println("2. 도서명 검색");
        System.out.println("3. 저자명 검색");
        System.out.println("4. 출판사명 검색");
        System.out.print("옵션 선택: ");
        int option = scanner.nextInt();
        scanner.nextLine(); //엔터 및 뛰어쓰기 버퍼 비우기
        System.out.print("검색어 입력: ");
        String searchText = scanner.nextLine();
        BookEntity[] searchBooks = bookRepository.searchBooks(option, searchText);

        System.out.println("[ 검색 결과 ]");
        if (searchBooks.length == 0) {
            System.out.println("검색 결과가 없습니다.");
            return; //search() 메소드 나가기
        }
        for (BookEntity book : searchBooks) {
            System.out.println(book.toString());
            //System.out.println();
        }

    }

    private void remove() {
        System.out.println("[ 도서 삭제 ]");
        search();
        System.out.print("삭제할 도서번호를 입력: ");
        int removeBookId = scanner.nextInt();
        scanner.nextLine();
        BookEntity book = bookRepository.findBookByBookId(removeBookId);
        if(book == null) {
            System.out.println("해당 도서번호는 존재하지 않습니다.");
            return;
        }
        bookRepository.deleteBookByBookId(removeBookId);
    }

    private void modify() {
        System.out.println("[도서 수정]");
        search();
        System.out.print("수정 할 도서번호 입력: ");
        int modifyBookId = scanner.nextInt();
        scanner.nextLine();
        BookEntity book = bookRepository.findBookByBookId(modifyBookId);
        if(book == null) {
            System.out.println("해당 도서번호는 존재하지 않습니다.");
            return;
        }
        System.out.println("<< 도서 수정 정보 입력 >>");
        for(int i = 0; i < 3; i++) {
            String selected = null;
            switch (i) {
                case 0:
                    System.out.print("도서명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) {        //selected.equalsIgnoreCase("y") 대소문자 구분없이 비교해라
                        String bookName = duplicateBookName();
                        book.setBookName(bookName);
                        break;
                    }

                    break;
                case 1:
                    System.out.print("저자명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) {        //selected.equalsIgnoreCase("y") 대소문자 구분없이 비교해라
                        String author = validateValus("저자");
                        book.setAuthor(author);
                        break;
                    }
                    break;
                case 2:
                    System.out.print("출판사명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if(selected.equalsIgnoreCase("y")) {        //selected.equalsIgnoreCase("y") 대소문자 구분없이 비교해라
                        String publisher = validateValus("출판사");
                        book.setPublisher(publisher);
                        break;
                    }


            }
        }
        //String bookName = duplicateBookName();
       // String author = validateValus("저자");
       // String publisher = validateValus("출판사");

        //book.setBookName(bookName);
       // book.setAuthor(author);
        //book.setPublisher(publisher);
        
    }


}
