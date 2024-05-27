package com.study.java_study.ch06_배열;

public class BookArrayUtils {
    int findIndexByBookName(String[] booknames, String name) {
        for (int i = 0; i < booknames.length; i++) {
            if(booknames[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
