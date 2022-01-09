package com.codewars.helpBookSeller;

import java.util.HashMap;
import java.util.Map;

public class StockList {
    // 1st parameter is the stock list,
    // 2nd parameter is list of categories
    /*
    Task is to find all the books of lstOfArt with codes belonging to each category of lstOf1stLetter and to sum their
    quantity according to each category.
     */
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        Map<String, Integer> map = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            for (int j = 0; j < lstOfArt.length; j++) {
                String[] str = lstOfArt[j].split("\\s+");
                if (str[0].substring(0, 1).equals(lstOf1stLetter[i])) {
                    int value = Integer.parseInt(str[1]);
                    if (map.containsKey(lstOf1stLetter[i])) {
                        map.put(lstOf1stLetter[i], map.get(lstOf1stLetter[i]) + value);
                    } else {
                        map.put(lstOf1stLetter[i], value);
                    }
                } else {
                    if (!map.containsKey(lstOf1stLetter[i])) {
                        map.put(lstOf1stLetter[i], 0);
                    }
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sb.append("(" + entry.getKey() + " : " + entry.getValue() + ") - ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 3, sb.length() - 1);
        return sb.toString().trim();
    }
}
