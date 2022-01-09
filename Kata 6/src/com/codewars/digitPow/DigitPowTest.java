package com.codewars.digitPow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitPowTest {
    @Test
    void digitPowTest() {
        assertEquals(1, DigitPow.digPow(89, 1));
        assertEquals(2, DigitPow.digPow(695, 2));
        assertEquals(51, DigitPow.digPow(46288, 3));
        assertEquals(-1, DigitPow.digPow(10, 1));
    }
}