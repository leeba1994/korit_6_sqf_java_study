package com.study.java_study.ch18_빌더;

public class StudentMain {
    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(1)
                .age(31)
                .build();

        System.out.println();
    }
}
