package com.study.java_study.ch07_클래스02;

public class StudyA {
    int num;
    int num2;

    // 생성자
    // 1. 클래스 명과 동일하다.
    // 2. 리턴 자료형이 없다.
    // 3. 생성자는 무조건 할당된 메모리의 주소를 리턴한다.


    //NoArgsConstructor 매개변수가 없는 생성자
    StudyA() {
        System.out.println("스터디 에이 객체 생성");
    }


    //AllArgsConstructor
    StudyA(int num, int num2) {                                          //StudyA() 생성자이면서 리턴자료형 이다
        System.out.println("스터디 에이 객체 생성");
        this.num = num;      //this.num 전역변수 지정 num 지역변수 지정
        this.num2 = num2;
    }

    void increase(int increaseNum) {
        num += increaseNum;
        num2 += (increaseNum * 2);
    }

    void decrease(int decreaseNum) {
        num -= decreaseNum;
        num2 -= (decreaseNum * 2);
    }

}
