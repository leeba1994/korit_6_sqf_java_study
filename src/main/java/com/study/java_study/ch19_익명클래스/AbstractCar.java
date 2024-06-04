package com.study.java_study.ch19_익명클래스;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;



@AllArgsConstructor
@Data
public abstract class AbstractCar {

//    @Getter     //모델만 겟터
    private String model;
    private String color;

//    public AbstractCar(String model) {
//        this.model = model;
//    }

    public abstract void createCar();
    public abstract void showCar();

}
