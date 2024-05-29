package com.study.java_study.ch10_추상화01;

public class Animal { //호랑이, 개 공통사항을 Animal넣는다, Animal은 Tiger및 Dog 추상화했다
    private String name;
    private int age;

    public Animal() {
        System.out.println("동물 객체 생성");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
