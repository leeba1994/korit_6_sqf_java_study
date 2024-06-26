package com.study.java_study.ch22_예외;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

//@AllArgsConstructor
@Data
public class LoginException extends RuntimeException{
    private String username;

    public LoginException(String message, String username) { //@AllArgsConstructor 미사용시
        super(message);
        this.username = username;
    }


    public String getErrorMessage() {
        return username + "사용자 이름이 올바르지 않거나 비밀번호가 일치하지 않습니다.";
    }
}
