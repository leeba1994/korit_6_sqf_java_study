package com.study.java_study.ch09_클래스04;

// 저장소 -> CRUD
//저장소안에서 CRUD 이루어짐
//부품 생성
public class BookRepository {
    private int bookId;
    private BookEntity[] books;
    private BookEntity[] deletedbooks;

    public BookRepository() { //BookRepository() 생성자 만듬
        books = new BookEntity[0];

        deletedbooks = new BookEntity[0];
    }

    public int autoIncrementBookID() {
        return ++bookId;        //선증가 바로 1증가해서 리턴
    }

    /*
    private void extendBooks() {    //캡슐화
        // 기존 배열보다 크기가 하나 더 큰 배열을 생성한다.
        BookEntity[] newBooks = new BookEntity[books.length + 1];

        // 기존 배열의 정보를 새로운 배열로 모두 옮긴다. 이 떄 마지막 인덱스의 값은 빈값이다.
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }

        // 기존 배열의 주소가 들어있는 books 변수에 새로운 배열의 주소를 대입한다.
        books = newBooks;
    }
    */

    private void extendBooks() {    //캡슐화, 확장 메소드
        // 기존 배열보다 크기가 하나 더 큰 배열을 생성한다.
        BookEntity[] newBooks = new BookEntity[books.length + 1];

        // 기존 배열의 정보를 새로운 배열로 모두 옮긴다. 이 떄 마지막 인덱스의 값은 빈값이다.
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }

        // 기존 배열의 주소가 들어있는 books 변수에 새로운 배열의 주소를 대입한다.
        books = newBooks;

    }

    private int getLastIndex() {
        return books.length - 1;
    }

    public void saveBook(BookEntity book) { //book 도서 객체를 받아오면 saveBook 저장한다
        /*
        // 기존 배열보다 크기가 하나 더 큰 배열을 생성한다.
        BookEntity[] newBooks = new BookEntity[books.length + 1];

        // 기존 배열의 정보를 새로운 배열로 모두 옮긴다. 이 떄 마지막 인덱스의 값은 빈값이다.
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }

        // 기존 배열의 주소가 들어있는 books 변수에 새로운 배열의 주소를 대입한다.
        books = newBooks;
        */

        // 배열 확장
        extendBooks();

        // 새로운 배열의 비어있는 마지막 인덱스에 매개변수로 받아온 book 객체를 대입한다.
        //books[books.length - 1] = book;
        books[getLastIndex()] = book;
    }


    // 단건조회
    public BookEntity findBookByBookId(int bookId) {    //선형탐색알고리즘, 배열은 선형탐색으로한다
        BookEntity findBook = null;

        //선형탐색(순차 탐색)
        for (BookEntity book : books) {
            if (book.getBookId() == bookId) {
                findBook = book;
                break;
            }
        }
        return findBook;
    }

    // 단건조회
    public BookEntity findBookByBookName(String bookName) {
        BookEntity findBook = null;

        //선형탐색
        for (BookEntity book : books) {
            if (book.getBookName().equals(bookName)) { //String 이라서 값내용의 비교 하기
                findBook = book;
                break;
            }
        }
        return findBook;
    }

    private int getNewArraySize(int option, String searchText) {
        int newArraySize = 0;


        switch (option) {               //contains() 해당문자열에 글자가 1개라도 포함되어있는지 비교

            case 1: // 통합검색
                for (BookEntity book : books) {
                    if (book.getBookName().contains(searchText)   //contains() 해당문자열에 글자가 1개라도 포함되어있는지 비교
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 2: //도서명검색
                for (BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 3: //저자명검색
                for (BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 4: //출판사명검색
                for (BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }


        }
        return newArraySize;

    }

    // 다건조회
    public BookEntity[] searchBooks(int option, String searchText) {
        /*
        int newArraySize = 0;
        
        for(BookEntity book : books) {
            if(book.getBookName().contains(bookName)   //contains() 해당문자열에 글자가 1개라도 포함되어있는지 비교
                    || book.getAuthor().contains(author)
                    || book.getPublisher().contains(publisher)) {
                newArraySize++;
            }
        }
        */
        int newArraySize = getNewArraySize(option, searchText);
        BookEntity[] searchBooks = new BookEntity[newArraySize];

        int i = 0;
        switch (option) {               //contains() 해당문자열에 글자가 1개라도 포함되어있는지 비교
            case 1: // 통합검색
                for (BookEntity book : books) {
                    if (book.getBookName().contains(searchText)   //contains() 해당문자열에 글자가 1개라도 포함되어있는지 비교
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++; //if 조건이 맞으면 i 증가
                    }
                }
                break;
            case 2: //도서명검색
                for (BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 3: //저자명검색
                for (BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 4: //출판사명검색
                for (BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }


        }


        return searchBooks;
    }

    private int IndexOfBookId(int bookId) {
        int findIndex = -1;

        for(int i = 0; i < books.length; i++) {
            if(books[i].getBookId() == bookId) {
                findIndex = i;
                break;
            }
        }

        return findIndex;
    }





    public void deleteBookByBookId(int bookId) {
        int findIndex = IndexOfBookId(bookId);
        BookEntity[] newBooks = new BookEntity[books.length - 1]; //newBooks 새 배열 생성 (books 배열의 -1 사이즈 만큼)
        //BookEntity[] delBooks = new BookEntity[books.length + 1];
        //int findIndex = -1;
       /*
       for(int i = 0; i < books.length; i++) {
            if(books[i].getBookId() == bookId) {
                findIndex = i;
                break;
            }
            
        }
        */

        for(int i = 0; i < newBooks.length; i++) {
            if(i < findIndex) {
                newBooks[i] = books[i];
                continue;
            }
            newBooks[i] = books[i + 1];
        }
        books = newBooks;


    }

}
