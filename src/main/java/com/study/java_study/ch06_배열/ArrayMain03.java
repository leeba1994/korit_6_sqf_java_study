package com.study.java_study.ch06_배열;

public class ArrayMain03 {
    public static void main(String[] args) {
        int[] nums = new int[] { 10, 20, 30, 40, 50, 60 };
        int[] nums2 = new int[6];

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;
        int num6 = 60;
        
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        //nums[4] = 50;
        nums[5] = 60;

        nums2[0] = 10;
        nums2[1] = 20;
        nums2[2] = 30;
        nums2[3] = 40;
        //nums[4] = 50;
        nums2[5] = 60;
        //관련된 데이터를 하나로 묶어서 쓰기위함
        for (int num : nums) {
            System.out.println(num);
        }

        String[] strArray= new String[5];
        strArray[0] = "가";
        strArray[1] = "나";
        strArray[2] = "다";
        strArray[3] = "라";
        strArray[4] = "마";

        for(String str : strArray) {
            System.out.println(str);
        }

        double[] doubles = new double[3];
        doubles[0] = 10.5;
        doubles[1] = 20.5;
        doubles[2] = 30.5;
        doubles[0] = 11.5;

        for(double dNum : doubles) {
            System.out.println(dNum);
        }

        Computer[] computers = new Computer[3];
        computers[0] = new Computer("I3", "8GB");
        computers[1] = new Computer("I5", "16GB");
        computers[2] = new Computer("I7", "32GB");

        for(Computer computer : computers) {
            System.out.println(computer.toString());
        }

    }
}
