package com.study.java_study.ch17_컬렉션;

import com.study.java_study.ch06_배열.Computer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class StringHashSetMain {
    public static void main(String[] args) {

        HashSet<String> strSet = new HashSet<>();   //해쉬값으로 정렬해서 들어감

        // 추가
        strSet.add("이병일");
        strSet.add("이병이");
        strSet.add("이병삼");
        strSet.add("이병사");
        strSet.add("이병오");

        System.out.println(strSet);

        for(String name : strSet) {
            System.out.println(Objects.hash(name));
        }


        strSet.addAll(List.of("이병일", "이병삼", "이병오"));    //값 중복안됨, 중복제거 할떄 쓴다

        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(strSet);





        strList.sort((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1, o2));
        System.out.println(strList);
        //strSet.addAll()
    }
}
