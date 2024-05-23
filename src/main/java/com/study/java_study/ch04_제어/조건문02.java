package com.study.java_study.ch04_제어;

public class 조건문02 {
    public static void main(String[] args) {
        String text = new String("");
        String name = "이병안";       //값의 자료형이 String
        String phone = "01024804593";    //값의 자료형이 null
        // 공백도 리터럴이다
        // == 실제데이터의 값 비교가 아니고 주소값 비교 이다

        StringUtils stringUtils = new StringUtils();

        System.out.println(text);
        System.out.println(name);

        if(stringUtils.isEmpty(name)) {
            System.out.println("name이 비어있습니다.");
            return; //함수에 리턴자료형이 보이드일때
        }


       if(stringUtils.isEmpty(phone)) {
            System.out.println("phone이 비어있습니다.");
            return;
        }

        //if(phone == null || phone == "") {
        //    System.out.println("phone이 비어있습니다.");
        //}

        //if(phone == null || phone == "") {
        //    System.out.println("phone이 비어있습니다.");
        //}

        if(stringUtils.isEmpty(text)) {
            System.out.println("text이 비어있습니다.");
            return;
        }






        //System.out.println(text.length());
        //System.out.println(name.length());
        //System.out.println(phone.length());


    }
}
