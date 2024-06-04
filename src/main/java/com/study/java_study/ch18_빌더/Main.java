package com.study.java_study.ch18_빌더;

public class Main {
    public static void main(String[] args) {
        //B b = new B(); 생성불가 A클래스 안에있음
        //내부 클래스
        A a = new A();
        A.B b = a.new B();


        a.test();
        b.print();

        A.C c = new A.C();      //A클래스 안에 C클래스는 스태틱되어있음
        c.show();

        A.C.show2();
    }
}
