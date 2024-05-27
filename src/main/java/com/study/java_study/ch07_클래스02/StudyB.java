package com.study.java_study.ch07_클래스02;

public class StudyB {

    private String name;
    private int age;

    public StudyB() {}   //기본 생성자 생략되어 있음, 오버로딩시 기본생성자 삭제됨

    /* public void show() {
        System.out.println(name);
        System.out.println(age);
    } */
    public StudyB(String name, int age) {  //오버로딩시 기본생성자 삭제됨
        this.name = name;
        this.age = age;

    }
    /*
    public void setName(String name) {
        this.name = name; //셋터, 캡슐화, 정보 은닉
    }

    public String getName() {
        return name; //겟터
    }
    
    모든 라이브러리가 (겟터, 셋터) 표준화 되어있음
     */

    public int getAge() {
        return age; //Alt + Ins = 겟터 셋터 만들기 단축키
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name);
        System.out.println(age);
    }

}
