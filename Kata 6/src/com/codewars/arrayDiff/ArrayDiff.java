package com.codewars.arrayDiff;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        //transfer arrays to lists
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        //remove same elements from lists, creating new array and filling it
        if (listA.size() > listB.size()) {
            listA.removeAll(listB);
            a = new int[listA.size()];
            for (int i = 0; i < listA.size(); i++) {
                a[i] = listA.get(i);
            }
        }
        else {
            listB.removeAll(listA);
            a = new int[listB.size()];
            for (int i = 0; i < listB.size(); i++) {
                a[i] = listB.get(i);
            }
        }
        return a;
    }
}
