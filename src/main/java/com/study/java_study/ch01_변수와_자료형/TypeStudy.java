package com.study.java_study.ch01_변수와_자료형;

public class TypeStudy {
    public static void main(String[] args) {
        // [일반 자료형]
        // 1. 논리
        boolean a = false;
        boolean b = true;

        // 2. 숫자(정수)
        int c = 1000000000;
        long d = 100000000000l; //l 리터럴 때문에 l 붙여주기

        // 3. 숫자(실수)
        double e = 3.14;

        // 4. 문자
        char f = '가'; // AC00

        // 5. 문자열
        String g = "가나다";


        System.out.println((char) ((int) f + 1)); //형변환

        //형변환 문자 -> 정수 -> 실수

        double num = 3.14;
        System.out.println(num);
        int num2 = (int) num; //명시적 형변환 다운 캐스팅
        System.out.println(num2);
        double num3 = num2; //업 캐스팅
        System.out.println("num3 = " + num3);

        //리터럴 상수 리터럴 자료형이 고정되어있음
        

        /*
        자바에서의 리터럴은 그 자체로 값을 의미하는 것을 말한다.

        기존의 상수와 같은 의미이다. 하지만 자바에서 상수(constant)를
        '한번 만 값을 저장 가능한 변수' 라는 의미로 정의했기 때문에 구별하기
        위해 따로 리터럴(literal)이라는 단어를 사용한다.
        */

    }
}
