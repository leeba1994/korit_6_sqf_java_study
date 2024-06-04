package com.study.java_study.ch20_람다;

public class ModificationMain {

    public static void main(String[] args) {
        Modification<String> m1 = new Modification<>() {
            @Override
            public String modify(String oldData, String newData) {
                System.out.println("기존데이터: " + oldData);
                System.out.println("새로운데이터: " + newData);
                return newData;
            }
        };

        Modification<String> m2 = new Modification<>() {
            @Override
            public String modify(String oldData, String newData) {

                return newData;
            }
        };

        Modification<String> m3 = (String oldName, String newName)  -> {
            System.out.println("기존데이터: " + oldName);
            System.out.println("새로운데이터: " + newName);
            return newName;
        };

        Modification<String> m4 = (oldName, newName) -> newName;

        Modification<Integer> m5 = (x, y) -> x < y ? x : y;


        String name = "김준일";
        String newName = m1.modify(name, "김준이");
        System.out.println(newName);

        String newName2 = m2.modify(name, "김준삼");
        System.out.println(newName2);

        String newName4 = m4.modify(name, "김준사");
        System.out.println(newName4);

        System.out.println(m4.modify(name, "김준오"));

        System.out.println(m5.modify(2, 1));

    }
}
