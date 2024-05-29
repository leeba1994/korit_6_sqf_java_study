package com.study.java_study.ch11_추상화02;

/*
1. 추상화
추상화는 클래스들의 공통적인 요소를 뽑아서 상위 클래스를 만들어내는 것이다.
반드시 상위 클래스일 필요는 없어서, 공통적인 속성과 기능을 정의한 하위 클래스를 생성할 수도 있다.
한 마디로 추상화는 공통적인 속성과 기능을 정의함으로써 코드의 중복을 줄이고, 클래스 간 관계를 효과적으로 설정하고,
유지/보수를 용이하게 하는 것이다. 자바에서는 추상 클래스와 인터페이스라는 문법 요소를 통해 추상화를 구현한다.


2. abstract 제어자
abstract는 주로 클래스와 메서드에 붙이는 키워드인데, 이것을 붙이면 자동으로 '추상 클래스'와 '추상 메서드'가 된다.
abstract는 '추상적인'이라는 사전적인 의미가 있지만,
핵심은 '미완성'이라는 개념에 있다. abstract class 클래스명 { ... }와 같이 클래스 선언부가 작성되어 있으면
이것은 미완성된 추상 클래스이므로 상속을 통해 내부의 추상 메서드를 구현해줘야한다는 점을 알 수 있다.
(추상 메서드가 없더라도 키워드를 붙여서 추상 클래스로 지정할 수 있다. 다만 메서드 바디가 완성 되기 전까지는 이를 기반으로 한 인스턴스 생성이 불가하다.)


 */


public abstract class Animal {

    public abstract void move();
}
