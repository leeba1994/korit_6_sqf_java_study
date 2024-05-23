package com.study.java_study.ch04_제어;

public class StringUtils {
    //is 나 헤즈 이다 아니다 할떄
    //단일 책임원칙

    boolean isEmpty(String str) {
        //System.out.println(str);
        if (str == null) {
            return true;
        }
            return str.equals("");


        //return str == null || str.equals("");
    }
    //null 제일먼저 체크한다


    //boolean isEmpty(String str) {
    //    System.out.println(str);
    //    return str == null || str.equals("");
    //}

}
