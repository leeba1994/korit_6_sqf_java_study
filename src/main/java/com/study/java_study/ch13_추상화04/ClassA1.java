package com.study.java_study.ch13_추상화04;

public class ClassA1 extends ClassA{

    @Override
    public void print(InterfaceA interfaceA) {      //print는 interfaceA를 의존한다, D.I 라고한다
        System.out.println("A1 클래스에서 print호출");
        interfaceA.test();      //의존성 주입

    }

    public void print() {
        System.out.println("A1 클래스에서 print호출");
      
    }
    
    
    
    
}
