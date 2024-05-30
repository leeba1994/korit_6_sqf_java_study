package com.study.java_study.ch15_Static;
//스태틱
public class StudentService {
    private static StudentService instance;     //null 가지고 있음
    //private StudentService instance;

    private StudentService() {}

    public static  StudentService getInstance() {
        if(instance == null) {
            instance = new StudentService();
        }
        return instance;
    }

    public void addStudent() {
        StudentRepository.getInstance().add("이병안");     //StudentRepository.getInstance()여기까지가 객체의 주소이다
    }

    public void getStudentData() {
        String[] names = StudentRepository.getInstance().getNames();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();

    }
}
