package com.study.java_study.ch03_함수;

public class Function04 {
    void add(int a,int b) {
        System.out.println(a + b);

    }

    void  add(int a, int b, int c){
        System.out.println(a + b + c);
    }







   //파라미터에 자료형이 중요하다
    String  add(int a, int b,String f){
        //System.out.println(a + b + c)
                return "ssdsa" ;
    }
    //오버로딩

    //매개변수 자료형이 다르면 함수이름이 같아도 자료형에 따라 찾아간다
    void  add(int a, String b){
        int c = Integer.parseInt(b);
        System.out.println(a + c);
    }
}
