package com.codewars.duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
This program analyzes the line and counting the number of duplicates in it.
 */
public class Duplicates {
    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>(Arrays.asList(text.split("")));
        int count = 0;
        int value = 1;
        for (String str : list) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, value);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                count++;
            }
        }
        return count;
    }
}

