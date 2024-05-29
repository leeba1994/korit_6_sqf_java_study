package com.study.java_study.ch10_추상화01;

public class Dog extends Animal {       //Animal에서 확장한 Dog클래스, Animal에서 상속받아 Dog
    //private String name;
    //private int age;
    private String bread;

    public Dog() {
        super();        //제일위에 있어야 한다 부모객체를 먼저 생성
        //super();      Animal객체 생성자 호출, 기본적으로는 생략이 되어있음, 부모객체 생성자
        System.out.println("강아지 객체 생성");
        
    }

    public Dog(String name, int age, String bread) {        //타이거가 생성될때 매개변수(String name, int age, int power)를 super(name, age) 부모객체에 전달해준다
        super(name, age);
        this.bread = bread;
    }

    @Override       //컨트롤 + o 단축키 부모 메소드 불려오기
    public void move() {
        System.out.println("강아지가 네발로 움직입니다.");
    }

    public void bark() {
        System.out.println(bread + "종의 강아지가 짖습니다.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "bread='" + bread + '\'' +
                '}';
    }


}
