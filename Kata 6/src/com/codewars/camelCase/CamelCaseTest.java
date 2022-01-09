package com.codewars.camelCase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseTest {
    @Test
    void camelCaseTest() {
        assertEquals("CamelCase", CamelCase.camelCase("Camel case"));
        assertEquals("Camelcase", CamelCase.camelCase("Camelcase"));
        assertEquals("CamelCase", CamelCase.camelCase("Camel    case"));
        assertEquals("", CamelCase.camelCase("                 "));
    }

}