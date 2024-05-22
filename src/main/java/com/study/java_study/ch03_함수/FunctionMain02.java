package com.study.java_study.ch03_함수;

public class FunctionMain02 {
    public static void main(String[] args) {
        Function02 fx = new Function02(); //객체 생성, 동적메모리 할당, 인스턴스

        fx.fx01();
        fx.fx02(10, 20);
        fx.fx03(2, 1.445f);
        fx.fx03(2, 1);
        //클래스안에 메소드 클래스밖은 함수
        //https://velog.io/@effirin/Java-%ED%97%B7%EA%B0%88%EB%A6%AC%EB%8A%94-%EB%B3%80%EC%88%98-%EC%A2%85%EB%A5%98-%EC%A0%95%EB%A6%AC 참고
        System.out.println("---------------------");
       // fx.빙수만들기("딸기", 10);
        System.out.println(fx.빙수만들기("딸기", 10) + " 주문 완료");
        String 빙수 = fx.빙수만들기("초코", 5);
        System.out.println(빙수);



    }
}
