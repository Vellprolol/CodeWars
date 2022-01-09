package com.codewars.camelCase;

public class CamelCase {
    public static String camelCase(String str) {
        str = str.trim();
        if (str.isEmpty()) {
            return str;
        }
        String[] strings = str.split("\\W+");
        StringBuffer sb = new StringBuffer();
        for (String string : strings) {
            string = string.substring(0, 1).toUpperCase() + string.substring(1);
            sb.append(string);
        }
        return sb.toString();
    }
}
