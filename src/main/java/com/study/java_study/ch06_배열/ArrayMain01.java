package com.study.java_study.ch06_배열;

public class ArrayMain01 {

    public static void main(String[] args) {
    //    int num1 = 10;
    //    int num2 = 20;
    //    int num3 = 30;
        // int[] 배열 자료형
        // 배열은 반복을 쓰기 위해 쓴다
        int[] nums = new int[100]; // 객체 생성 후 int[10] 4바이트 크기 10개 지정, 배열은 인덱스를 참조를 한다

        for(int i = 0; i < 100; i++) {
            nums[i] = (i + 1) * 10;
        }


        //: for 이치 - 처음부터 끝까지 반복
        for (int num : nums) {
            System.out.println(num);
        }


        //==
        for (int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                continue;
            }
            int num = nums[i];
            System.out.println(num);
        }


    }
}
