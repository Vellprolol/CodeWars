package com.codewars.helpBookSeller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockListTest {
    @Test
    void stockListTest() {
        assertEquals("(B : 500) - (C : 0) - (X : 1000)", StockList.stockSummary(new String[]{"ABART 20", "BKWRK 411", "BTSQZ 89", "XCTYM 490", "XRTYM 510"},
                new String[]{"X", "B", "C"}));
        assertEquals("(B : 500) - (C : 432) - (X : 1000)", StockList.stockSummary(new String[]{"ABART 20", "BKWRK 411", "BTSQZ 89", "CDRGS 432", "XCTYM 490", "XRTYM 510"},
                new String[]{"X", "B", "C"}));
        assertEquals("(R : 0) - (F : 0) - (L : 0)", StockList.stockSummary(new String[]{"ABART 20", "BKWRK 411", "BTSQZ 89", "CDRGS 432", "XCTYM 490", "XRTYM 510"},
                new String[]{"L", "F", "R"}));
    }

}