package com.study.java_study.ch16_제네릭;

import lombok.ToString;
/*
제네릭

Sender<T> 작성 T는 타입을 말한다.

제네릭(Generic)은 클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것을 의미한다.
한마디로 특정(Specific) 타입을 미리 지정해주는 것이 아닌 필요에 의해 지정할 수 있도록 하는 일반(Generic) 타입이라는 것이다.


(정확히 말하자면 지정된다는 것 보다는 타입의 경계를 지정하고,
컴파일 때 해당 타입으로 캐스팅하여 매개변수화 된 유형을 삭제하는 것이다.
이 것을 여기서 모두 설명하기에는 너무 길어지므로 일단 지정된다 정도로 알고가도 이해하는데 큰 문제는 없을 것이다.)



Generic(제네릭)의 장점

1. 제네릭을 사용하면 잘못된 타입이 들어올 수 있는 것을 컴파일 단계에서 방지할 수 있다.
2. 클래스 외부에서 타입을 지정해주기 때문에 따로 타입을 체크하고 변환해줄 필요가 없다. 즉, 관리하기가 편하다.
3. 비슷한 기능을 지원하는 경우 코드의 재사용성이 높아진다.


타입  	설명
<T> 	Type
<E> 	Element
<K> 	Key
<V> 	Value
<N> 	Number
물론 반드시 한 글자일 필요는 없다. 또한 설명과 반드시 일치해야 할 필요도 없다. 예로들어 <Ele>라고 해도 전혀 무방하다.
다만 대중적으로 통하는 통상적인 선언이 가장 편하기 때문에 위와같은 암묵적(?)인 규칙이 있을 뿐이다.



 */
@ToString
public class Sender<T, T2, T3> {
    //private int data1;     //String -> int
    private T data1;     //String -> int
    private T2 data2;
    private T3 data3;

    public Sender(T data1, T2 data2, T3 data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public T getData1() {
        return data1;
    }

    public void setData1(T data1) {
        this.data1 = data1;
    }

    public T2 getData2() {
        return data2;
    }

    public void setData2(T2 data2) {
        this.data2 = data2;
    }

    public T3 getData3() {
        return data3;
    }

    public void setData3(T3 data3) {
        this.data3 = data3;
    }
}

