package com.study.java_study.ch16_제네릭;

public class SenderMain {

    public static void main(String[] args) {
        //시리얼 라이저(직렬화) = 다른 프로그래밍언어랑 통신하기위함
        
        //제네릭 쓸때 해당 자료형 사용
        //[ Wrapper 자료형 ]
        //Integer(클래스타입 자료형)                 int(일반자료형)
        //Boolean        --(언박싱)->             boolean
        //Character        <-(박싱)--             char
        //Double                                 double
        //Long                                   long
        //Float                                  float

        Integer num = new Integer(10);  // 박싱
        int num2 = num.intValue();      // 언박싱


        Integer num3 = 20;      //자바에서 자동으로 박싱과언박싱
        int num4 = num3;        // 자동 언박싱

        Sender sender1 = new Sender<Integer, String, Double>(10, "20", 3.14);
        Sender<String, Integer, String> sender2 = new Sender<>("test1", 10, "20");  //객체를 생성떄 자료형을 결정한다 ->제네릭, 생략가능


        System.out.println(sender1);
        System.out.println(sender2);
    }
}
