package com.study.java_study.ch18_빌더;

import lombok.Setter;

public class DataMain {
    public static void main(String[] args) {
        Data data = new Data("a", 10, 10.5, "b");
        Data data2 = new Data();        //@NoArgsConstructor
        data2.setData1("a");     //@Setter
        data2.setData3(3.14);        //@Setter


        DataEntity dataEntity = DataEntity.builder()
                .data1("a")
                .data2(10)
                .data4("b")
                .build();

        DataEntity2 dataEntity2 = DataEntity2.builder()
                .data1("a")
                .data2(2)
                .build();
    }
}
