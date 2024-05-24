package com.study.java_study.ch06_배열;

public class ArrayMain02 {
    public static void main(String[] args) {
        String a = "김준일"; // =>999 리터럴의 주소 를 저장
        String b = new String("김준일"); //new String은 메모리에 생성한다  b에 new String 의 주소를 저장, new String => 주소100가 생성됨 , b => 100주소를 저장

        System.out.println(a);
        System.out.println(b);
        System.out.println(a == "김준일");
        System.out.println(b == "김준일");

        String[] names = new String[2];
        names[0] = "김준일";
        names[1] = new String("김준일");

        String[] names2 = new String[] {"김준일", new String ("김준일")};
        //String[] names3 = {"김준일", new String ("김준일")};

        System.out.println(names[0] == names2[0]);
        System.out.println(names[1] == names2[1]);
        System.out.println(names == names2);

        int n = 10;

        n = n + 1;
        n++;
        n += 1;

        //배열 특징 - 값의 중복허용, 배열의 공간크기 조절 불가 늘리거나 줄이거나, 인덱스주소에 값의 저장한다, 새배열 생성후 이사해서 공간크기를 조절한다
        System.out.println(new String[2]); // [Ljava.lang.String;@7c30a502 배열의주소의 시작 [ 부터다
        System.out.println(new String[] {"a", "b"});
        System.out.println(new System[2]);

    }
}
