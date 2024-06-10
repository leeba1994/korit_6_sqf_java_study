package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface2 {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("run 실행");
            }
        };

        Runnable run = () -> System.out.println("run 실행");

        runnable.run();
        run.run();




        String name = "이병안";
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                String result = name + " 입니다.";
                return result;
            }
        };


        Supplier<String> get = () -> {
            String result = name + " 입니다.";
            return result;
        };

        System.out.println(supplier.get());
        System.out.println(get.get());


        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + name);
            }
        };

        Consumer<String> accept = s -> System.out.println(s + name);

        consumer.accept("이름 : ");
        accept.accept("이름 : ");






        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        Function<String, Integer> fx = s -> Integer.parseInt(s);

        Integer n = function.apply("10");
        Integer n2 = fx.apply("200");

        System.out.println(n);
        System.out.println(n2);





        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {

                return false;
            }
        };
    }
}
