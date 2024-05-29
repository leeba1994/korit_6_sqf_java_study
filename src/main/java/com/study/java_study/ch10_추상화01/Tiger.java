package com.study.java_study.ch10_추상화01;

public class Tiger extends Animal{
    //private String name;
    //private int age;
    private int power;

    public Tiger() {
        //super();      Animal객체 생성자 호출, 기본적으로는 생략이 되어있음, 부모객체 생성자
        System.out.println("호랑이 객체 생성");

    }

    public Tiger(String name, int age, int power) {     //타이거가 생성될때 매개변수(String name, int age, int power)를 super(name, age) 부모객체에 전달해준다
        super(name, age);
        this.power = power;
    }
        
    // 재정의 -> 상속관계에서만 가능, 자식쪽에서 재정의
    @Override       //@ 어노테이션, 재정의한 보여주기 위해 쓴다
    public void move() {
        System.out.println("호랑이가 네발로 뛰어갑니다.");
        super.move();       //부모의 move() 메소드 사용한다
    }

    public void hunt() {
        System.out.println("호랑이가 " + power + "의 힘으로 사냥을합니다.");
    }
    

    @Override
    public String toString() {
        return "Tiger{" +
                "power=" + power +
                "} " + super.toString();
    }
}
