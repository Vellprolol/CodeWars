package com.codewars.split;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitTest {

    @Test
    void solution() {
        assertArrayEquals(new String[] {"ab", "cd", "ef"}, Split.split("abcdef"));
        assertArrayEquals(new String[] {"ab", "cd", "e_"}, Split.split("abcde"));
        assertArrayEquals(new String[] {}, Split.split(""));
    }
}