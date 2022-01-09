package com.codewars.arrayDiff;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ArrayDiffTest {
    @Test
    void arrayTest() {
        Assertions.assertArrayEquals(new int[] {7, 8, 9}, ArrayDiff.arrayDiff(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[] {1, 2, 3, 4, 5, 6}));
        Assertions.assertArrayEquals(new int[] {7, 8, 9}, ArrayDiff.arrayDiff(new int[] {1, 2, 3, 4, 5, 6}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}));
        Assertions.assertArrayEquals(new int[] {}, ArrayDiff.arrayDiff(new int[] {}, new int[] {}));
    }
}