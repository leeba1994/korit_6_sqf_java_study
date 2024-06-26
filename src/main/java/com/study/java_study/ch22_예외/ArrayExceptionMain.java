package com.study.java_study.ch22_예외;

/*
    예외(오류)
    1. 컴파일 오류 -> 프로그램이 실행(메모리 할당) 되기 전에 오류
    2. 런타임 오류 -> 프로그램이 실행(메모리 할당)된 후에 오류


 */
public class ArrayExceptionMain {
    public static void printArray(Integer[] nums, int length) throws Exception {    //메소드 자체를 예외처리시킴, 메소드사용하려면 예외처리해야 사용가능

            for (int i = 0; i < length; i++) {
                System.out.println("i: " + nums[i]);

            }
    }

    public static void main(String[] args){
        Integer[] nums = new Integer[]{1, 2, 3, 4, 5};


        //     try {
//          for (int i = 0; i < 6; i++) {
//              System.out.println("i: " + nums[i]);
//          }
        try {

            printArray(nums, 6);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //     } catch (ArrayIndexOutOfBoundsException e) {
        //        System.out.println(e);
        //    }

        System.out.println("프로그램 종료");

    }
}

