package com.study.java_study.ch09_클래스04;
        //Entity 대상, 정보들의 집합, 도서의 정보의 집합, 기능들의 집합 용도, (생성자, 겟터 셋터) 필수

public class BookEntity {
    private int bookId;
    private String bookName;
    private String author;
    private String publisher;

    public BookEntity() {  //디폴트 생성자
    }

    public BookEntity(int bookId, String bookName, String author, String publisher) { //전체 생성자 만들기
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
    }

    public int getBookId() { //겟터 셋터 만들기
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override 
    public String toString() {  //정보출력 메소드용, toString() 만들기  
        return "BookEntity{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
