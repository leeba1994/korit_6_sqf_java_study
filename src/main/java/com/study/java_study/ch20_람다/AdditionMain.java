package com.study.java_study.ch20_람다;
/*
람다의 특징
람다 대수는 이름을 가질 필요가 없다
커링: 두 개 이상의 입력이 있는 함수는 최종적으로 1개의 입력만 받는 람다 대수로 단순화


익명 함수?
익명 함수들은 일급객체라는 특징을 가지고 있다.
일급 객체란 다른 객체들에 적용 가능한 연산을 모드 지원하는 개체를 가리킨다.
함수를 값으로 사용할 수도 있으며 파라미터로 전달 및 변수에 대입하기와 같은 연산들이 가능하다.


 */
public class AdditionMain {
    public static void main(String[] args) {

        Addition addition = new Addition() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }

//            @Override
//            public String add(String x, String y) {
//                return x + y;
//            }
        };

        int result = addition.add(10, 20);
        System.out.println("결과: " + result);


        Addition addition2 = (x, y) -> x + y;
        //(a, b) -> a + b;


        result = addition2.add(10, 20);
        System.out.println("결과2: " + result);
    }
}
