package com.codewars.middleChar;

public class MiddleChar {
    public static String getMiddle(String word) {
        String s = String.valueOf(word.charAt(word.length() / 2));
        if (word.length() % 2 != 0) {
            return s;
        } else {
            return String.valueOf(word.charAt(word.length() / 2 - 1)).concat(s);
        }
    }
}
