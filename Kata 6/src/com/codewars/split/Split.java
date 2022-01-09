package com.codewars.split;

public class Split {
    public static String[] split(String s) {
        if (s.length() == 0) {
            return new String[0];
        }
        if (s.length() % 2 != 0) {
            s = s.concat("_");
        }
        return s.split("(?<=\\G.{2})");
    }
}
