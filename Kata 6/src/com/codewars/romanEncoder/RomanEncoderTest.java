package com.codewars.romanEncoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanEncoderTest {

    @Test
    void encode() {
        assertEquals("MXXI", RomanEncoder.encode(1021));
        assertEquals("M", RomanEncoder.encode(1000));
        assertEquals("", RomanEncoder.encode(4000));
        assertEquals("", RomanEncoder.encode(-1));
        assertEquals("", RomanEncoder.encode(0));
    }
}