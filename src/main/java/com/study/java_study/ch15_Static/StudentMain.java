package com.study.java_study.ch15_Static;
/*
    싱글톤 디자인 패턴
    1. 객체를 유일하게 하나만 생성하여 사용하는 기법
    2. 생성자가 private으로 외부에서는 생성 할 수 없다.
 */
public class StudentMain {
    public static void main(String[] args) {
        //StudentService studentService = new StudentService();  private StudentService() {} 이라서 안됨
        StudentService studentService = StudentService.getInstance();       //StudentService 객체를 생성하고
        StudentService studentService2 = StudentService.getInstance();      //StudentService 이전객체를 쓰겠다

        studentService.addStudent();
        StudentRepository.getInstance().add("이병안2");
        studentService2.addStudent();

        studentService.getStudentData();


        //StudentRepository studentRepository = StudentRepository.getInstance();
    }
}
