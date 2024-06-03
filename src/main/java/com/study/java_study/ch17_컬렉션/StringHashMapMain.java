package com.study.java_study.ch17_컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringHashMapMain {

    public static void main(String[] args) {
        HashMap<Integer, String> strMap = new HashMap<>();

        strMap.put(10, "김준일");   //이런식으로 Integer형 키 값은 사용하면 List 사용하기
        strMap.put(11, "김준이");
        strMap.put(12, "김준삼");
        strMap.put(15, "김준사");

        System.out.println(strMap);

        System.out.println(strMap.get(12));


        Map<String, String> lang = Map.of(      //상수 데이터 변경불가
                "java" , "자바",
                "c", "C",
                "python", "파이썬",
                "js", "자바스크립트",
                "js2", "자바스크립트",
                "js3", "자바스크립트"
        );

        System.out.println("lang2----------------------------------");

        Map<String, String> lang2 = new HashMap<>();
        lang2.putAll(lang);
        System.out.println(lang2);
       
        for(Map.Entry<String, String> entry : lang2.entrySet()) {
            System.out.println("key :" + entry.getKey());
            System.out.println("value :" + entry.getValue());
        }
        System.out.println("lang2---------------------------------------");





        System.out.println(lang);

        System.out.println(lang.get("java"));

        Set<Map.Entry<String, String>> entries = lang.entrySet();   //lang.entrySet();

       for(Map.Entry<String, String> entry : entries) {
            System.out.println("key :" + entry.getKey());
            System.out.println("value :" + entry.getValue());
        }

        System.out.println("---------------------------------");
        //Set<Map.Entry<String, String>> entrySet();

      //  for(Map.Entry<String, String> entry : lang.entrySet()) {
        for(Map.Entry<String, String> entry : lang.entrySet()) {
            System.out.println("key :" + entry.getKey());
            System.out.println("value :" + entry.getValue());
        }




    }

}
