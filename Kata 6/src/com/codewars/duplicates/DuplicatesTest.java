package com.codewars.duplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesTest {
    @Test
    public void duplicatesTest() {
        assertEquals(3, Duplicates.duplicateCount("abccddeeeer"));
        assertEquals(1, Duplicates.duplicateCount("abcdeeeer"));
        assertEquals(0, Duplicates.duplicateCount("abcder"));
        assertEquals(3, Duplicates.duplicateCount("AbCcDdeEeer"));
    }
}