package com.codewars.smile;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SmileTest {

    @Test
    void countSmileysTest1() {
        List<String> list = new ArrayList<>();
        list.add(":)");
        list.add(":~)");
        list.add(":D");
        list.add(":(");
        list.add(":~e");
        list.add(":-s");
        assertEquals(3, Smile.countSmileys(list));
    }
    @Test
    void countSmileysTest2() {
        List<String> list = new ArrayList<>();
        assertEquals(0, Smile.countSmileys(list));
    }
    @Test
    void countSmileysTest3() {
        List<String> list = new ArrayList<>();
        list.add(":)");
        list.add(";~)");
        list.add("^D");
        list.add(":(");
        list.add(":~e");
        list.add(":-s");
        assertEquals(2, Smile.countSmileys(list));
    }
}