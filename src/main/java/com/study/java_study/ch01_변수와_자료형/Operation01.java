package com.study.java_study.ch01_변수와_자료형;

public class Operation01 {
    public static void main(String[] args) {
        // 연산자

        // 산술연산자
        int num1 = 10 + 20;
        int num2 = 9 / 2;
        System.out.println(num2);
        int num3 = 9 % 2; // 나머지 값
        System.out.println(num3);
        boolean num4 = 5 % 2 == 0; //2의 배수 인지 확인
        System.out.println(num4);
        System.out.println("-------------------------------------------");


        // 증감 연산
        int i = 0 ; //선언은 한번만 하기
        //int i =10 ;
        System.out.println(i);
        i++;
        System.out.println(i);
        i = i +1;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i); //선 증감
        System.out.println(i++); //후 증감
        System.out.println(i);
        System.out.println("--i = "+--i); //선 감소
        System.out.println(i--); //후 감소
        System.out.println(i);

        System.out.println("----------------------------------------");

        // 논리연산자
        //true => 1
        //false => 0
        // && => AND(곱) 두관계 다 맞아야 된다
        // || => OR(합) 두관계 중 한개 만 맞아도 된다
        // ! => NOT(부정)


        System.out.println(true && true); //1 * 1 = 1
        System.out.println(true && false);
        System.out.println(true || true); // 1 + 1 = 1
        System.out.println(false || false); // 0+0=0
        System.out.println(!(true && true));
        System.out.println("----------------------------------------");


        // 관계연산자
        System.out.println(3 > 2 && 1 == 1);
        System.out.println(1 != 1); //서로 달라야 true

        System.out.println("----------------------------------------");

        // 조건연산자(삼항연산자)
        System.out.println(3 > 2 ? 10 : 20);


        int x = 10;
        int y = 2;
        String result = x % y == 0 ? "y의 배수입니다." : "y의 배수가 아닙니다."; //삼항연산자는 자료형의 일치 시켜주기
        String result2 = "" + 10/2;


        System.out.println("----------------------------------------");


        // 복합대입연산자
        int number = 10;
        //number = number + 5;
        number += 5; //자기 자신에 5더하고 대입해라
        System.out.println(number);
        number -= 1; //자기 자신에 1빼고 대입해라
        System.out.println(number);
        number *= 2; //자기 자신에 5곱하고 대입해라
        System.out.println(number);
        number /= 2; //자기 자신에 2나누고 대입해라
        System.out.println(number);
        number %= 2; //자기 자신에 2나누어 나머지를 대입해라
        System.out.println(number);

    }
}
