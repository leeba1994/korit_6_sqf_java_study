package com.study.java_study.ch03_함수;

public class FunctionMain01 {
    public static void main(String[] args) {
        Function01 function01 = new Function01(); //객체 생성
        //function01.add(10, 2);
        //System.out.println(function01.add(10,2));
        int result = function01.add(10, 2); //생성된 객체에 데이터를 넣고 함수 호출
        int result2 = function01.add(100, 50);
        int result3 = function01.sub(50, 50);


        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        function01.chout("--------------------");

        function01.chout("1234");
    }
}
