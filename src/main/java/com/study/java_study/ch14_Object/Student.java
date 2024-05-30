package com.study.java_study.ch14_Object;

import java.util.Objects;

//순서
public class Student {      //변수정의
    private String name;
    private int age;

    public Student(String name, int age) {      //생성자
        this.name = name;
        this.age = age;
    }
    
    //겟터getter and 셋터setter
    
    

    @Override
    public boolean equals(Object obj) {     //재정의해서 값비교 이전에는 주소값비교
        if(this == obj) {
            return true;
        }
        if(obj.getClass() == this.getClass()) {
            Student student = (Student) obj;
            return Objects.equals(student.name, name) && Objects.equals(student.age, age);
        }
        return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, age);     //name, age 해시값을 합쳐서 리턴, 다른패키지를 두객체의 값을 비교 하기위해 
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
