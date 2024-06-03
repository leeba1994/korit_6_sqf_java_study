package com.study.java_study.ch15_Static;

public class StudentRepository {
    private String[] names;

    private static StudentRepository instance;      //쟈기자신의 담는 인스턴스 변수, 미리 메모리에 할당 

    private StudentRepository() {
        names = new String[5];      //외부에서 생성안되게 private 접근지정자설정
    }

    public static  StudentRepository getInstance() {        //이런원리가 싱글톤이다
        if(instance == null) {
            instance = new StudentRepository();
        }
        return instance;
    }

    public void add(String name) {
        for(int i = 0; i < names.length; i++) {
            if(names[i] == null) {
                names[i] = name;
                break;
            }
        }


    }

    public String[] getNames() {
        return names;
    }
}
