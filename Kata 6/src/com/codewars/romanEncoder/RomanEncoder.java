package com.codewars.romanEncoder;

import java.util.TreeMap;

public class RomanEncoder {
    public static void main(String[] args) {
        System.out.println( fromRoman("MCDXXIX"));
    }
    public static String toRoman(int n) {
        if (n > 3999 || n < 1) {
            return "";
        }
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        int l =  map.floorKey(n);
        if (n == l) {
            return map.get(n);
        }
        return map.get(l) + toRoman(n-l);
    }

    public static int fromRoman(String romanNumeral) {
        if (!romanNumeral.matches("(M{0,3})(D?C{0,3}|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])")) {
            return 0;
        }
        final String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int l = 0;
        for (int i = 0; i < numerals.length; i++) {
            while (romanNumeral.startsWith(numerals[i])) {
                l += values[i];
                romanNumeral = romanNumeral.substring(numerals[i].length());
            }
        }
        return l;
    }
}
