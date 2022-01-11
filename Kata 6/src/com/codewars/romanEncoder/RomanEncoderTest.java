package com.codewars.romanEncoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanEncoderTest {

    @Test
    void encode() {
        assertEquals("MXXI", RomanEncoder.toRoman(1021));
        assertEquals("M", RomanEncoder.toRoman(1000));
        assertEquals("", RomanEncoder.toRoman(4000));
        assertEquals("", RomanEncoder.toRoman(-1));
        assertEquals("", RomanEncoder.toRoman(0));
        assertEquals(1021, RomanEncoder.fromRoman("MXXI"));
        assertEquals(1000, RomanEncoder.fromRoman("M"));
        assertEquals(0, RomanEncoder.fromRoman("MDFAXXAJOSAX"));
        assertEquals(1429, RomanEncoder.fromRoman("MCDXXIX"));
    }
}