package com.study.java_study.ch08_클래스03;

public class StudentMain {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        Student student1 = new Student(20240501, "이병일", 31);
        Student student2 = new Student(20240502, "이병일", 32);
        Student student3 = new Student(20240503, "이병일", 33);

        Student[] studentss = new Student[] {
                new Student(20240501, "이병일", 31),
                new Student(20240502, "이병일", 32),
                new Student(20240503, "이병일", 33)
        };


        numbers[0] = 10; // int num = 10;

        Student[] students = new Student[5]; //배열 생성, null 5개 생성됨, 5개의 students변수를 붙여서 쓰겠다
        students[0] = new Student(20240501, "이병일", 31);   //Student students = new Student();
        students[1] = new Student(20240502, "이병이", 32);   //Student students = new Student();
        students[2] = new Student(20240503, "이병삼", 33);   //Student students = new Student();


       // String name = students[0].getName();
        //System.out.println(name);
        //System.out.println(students[1].getName());
        //System.out.println();
        for (int i = 0; i < students.length; i++) {
            //students[i] = new Student(students[i].setCode());

            System.out.println(students[i]);
        }

        for(int i = 0; i < students.length; i++) {
            if(students[i] == null) {
                continue;
            }
            System.out.println("학번: " + students[i].getCode());
            System.out.println("이름: " + students[i].getName());
            System.out.println("나이: " + students[i].getAge());
            System.out.println();

        }


        

    }
}
