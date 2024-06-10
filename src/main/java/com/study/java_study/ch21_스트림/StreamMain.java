package com.study.java_study.ch21_스트림;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        /*
            Stream 은 반복을 위해 사용, 가공, 출력
        
             생성(사용) 절차
             1. 배열 생성 -> 스트림으로 변환
             2. List 생성 -> 스트림으로 변환
             3. generate 메소드 -> 스트림 생성
             4. 범위 지정 -> 스트림 생성
             5. 빌더 -> 스트림 생성

             중간(가공) 절차
             1. map(Function)
             2. filter(Predicate)
             3. sorted(Comparator)

             최종(결과) 절차
             1. collect -> stream을 list 변환
             2. 반복자 -> forEach

       */

        Stream<Integer> st1 = Arrays.stream(new Integer[] {1,2,3,4,5}); // 스트림 생성
        //System.out.println(st1);
        List<Integer> numberList = st1.map(n -> n * 2) // 가공, 배열에서 하나씩 가져와서 가공절차
                .peek(n -> System.out.println(n))   //스트림이 실행될떄 중간 결과확인용, 가공(기타 스트림 메소드)
                .collect(Collectors.toList());  //최종
        numberList.forEach(n -> System.out.println("n: " + n));


        List<Integer> filteringNumberList = numberList.stream()   //리스트를 스트림 변환
                .map(n -> n / 2)    //가공 하나씩 2로 나눠서 새스트림에 담는다
                .peek(n -> System.out.println(n)) //스트림이 실행될떄 중간 결과확인용, 가공(기타 스트림 메소드)
                .filter(n -> n % 2 == 0)    //가공 짝수만 필터링해서 새스트림 에 담는다
                .collect(Collectors.toList());  //최종 스트림을 리스트로 변환

        System.out.println(filteringNumberList);


        List<Integer> sortedNumberList = numberList.stream()
                .sorted((o1, o2) -> o2 - o1)    // 내림차순 정렬(o2 - o1), 오름차순 정렬(o1 - o2)
                .collect(Collectors.toList());

        System.out.println(sortedNumberList);


        Stream<String> nameStream = Stream.<String>builder()    //빌더 -> 스트림 생성
                .add("손경태") //가공 스트
                .add("최단비")
                .add("김지현")
                .add("정령우")
                .add("이성민")
                .build();

        //nameStream.sorted().forEach(name -> System.out.println(name));  //sorted() 스트링 기본값이 가나다순 정렬됨

        //nameStream.sorted((o1, o2) -> Objects.hash(o2) - Objects.hash(o1))
        nameStream.sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o2, o1))
                .forEach(name -> System.out.println(name));  //


        List<Phone> phoneList = List.of(
            Phone.builder().number(1).model("아이폰").build(),
            Phone.builder().number(2).model("갤럭시").build(),
            Phone.builder().number(3).model("샤오미").build()
        );

        /*phoneList.stream().map(phone -> {
            phone.setNumber(phone.getNumber() * 2);
            return phone;
        });*/

        phoneList.stream()
                .map(phone -> Phone.builder()   //Phone.builder() 새로운 객체생성
                .number(phone.getNumber() * 2)
                .model(phone.getModel())
                .build())
                .forEach(phone -> System.out.println(phone));   //새로운 맵에서 스트림돌림

        System.out.println("--------------------------------------------------");


        phoneList.stream()
                .filter(phone -> phone.getNumber() % 2 != 0)
                .forEach(phone -> System.out.println(phone));

        System.out.println("--------------------------------------------------");


        phoneList.stream()
                .sorted((o1, o2) -> o2.getNumber() - o1.getNumber())
                .forEach(phone -> System.out.println(phone));

        System.out.println("--------------------------------------------------");


        phoneList.stream()
                .sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getModel(), o2.getModel()))
                //.forEach(phone -> System.out.println(phone));
                .forEach(System.out :: println);    //자동으로 phone객체를 println메소드안에 넣어준다


    }
}
