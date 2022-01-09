package com.codewars.digitPow;

public class DigitPow {
    public static void main(String[] args) {
        System.out.println(digPow(89, 1));
    }
    public static long digPow(int n, int p) {
        // your code
        String s = Integer.toString(n);
        String[] strings = s.split("");
        long l = 0;
        for (String c : strings) {
            l += Math.pow(Integer.parseInt(c), p);
            p++;
        }
        if (l % n == 0) {
            return l / n;
        }
        else {
            return -1;
        }
    }
}
