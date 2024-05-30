package com.study.java_study.ch12_추상화03;
//Authority 인터페이스를 가지고 AbstractAuthority 추상클래스 생성
//interface 인터페이스 에 interface 인터페이스를 extends 으로 확장해서 사용한다
//abstract 에 interface 인터페이스를 implements 으로 확장해서 사용한다
public abstract class AbstractAuthority implements Authority {
    private String role;

    public AbstractAuthority() {
        role = DEFAULT_ROLE;
    }

    public AbstractAuthority(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role;
    }
}
