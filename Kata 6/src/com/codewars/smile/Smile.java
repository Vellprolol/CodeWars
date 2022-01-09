package com.codewars.smile;

import java.util.List;

public class Smile {
    public static int countSmileys(List<String> arr) {
        int count = 0;
        for (String string : arr) {
            if (string.matches("[;:]([\\-\\~])?[)D]")) {
                count++;
            }
        }
        return count;
    }
}
