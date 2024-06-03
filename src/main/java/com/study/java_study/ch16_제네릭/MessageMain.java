package com.study.java_study.ch16_제네릭;

public class MessageMain {
    public static void main(String[] args) {
        //제네릭 와일드 카드: 기호 -> ?

        int num;

        num = 10;

        //선언만하고 초기화 안한 상태일때 나중에 초기화하는데
        //Message<Integer> m1;
        //Message<Object> m1; Object자료형을 ?기호 로 표시한다
        Message<?> m1;
        Message<String> m2 = null;

        m1 = new Message<>("10");
        String s = (String) m1.getMessage();        //Object에서 String으로 다운캐스팅 해야한다

        //와일드 카드 제약
        Message<? extends String> m3 = new Message<>("10");       //자신의 기준(자신포함)으로 하행 String이랑 String 상속받은 자료형가능
        Message<? super String> m4 = new Message<>(new Object());       //자신의 기준(자신포함)으로 상행 String이랑 String의 부모  자료형가능


        String s2 = m3.getMessage();

    }
}
