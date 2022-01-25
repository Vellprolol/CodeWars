package com.codewars.sudokuValidator;

import java.util.HashMap;
import java.util.Map;

public class SudokuValidator {
    public static boolean validate(int[][] sudoku) {
        if (sudoku.length > 9) {
            return false;
        }
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                if (sudoku[i].length > 9) {
                    return false;
                }
            }
        }
        boolean isValid = true;
        //introduce local variables to split the sudoku into small arrays 3x3
        int c = 0;
        int d = 0;
        int value = 1;
        while (c < 9 && d < 9) {
        //creating map to check duplicate values in the small arrays
            Map<Integer, Integer> sudokuMap = new HashMap<>();
            for (int i = c; i < c + 3; i++) {
                for (int j = d; j < d + 3; j++) {
                    int key = sudoku[i][j];
                    if (sudokuMap.containsKey(key)) {
                        sudokuMap.put(key, sudokuMap.get(key) + 1);
                    } else {
                        sudokuMap.put(key, value);
                    }
                }
            }
            for (Map.Entry<Integer, Integer> entry : sudokuMap.entrySet()) {
                if (entry.getValue() > 1 || entry.getKey() == 0) {
                    isValid = false;
                }
            }
            d += 3;
            if (d > 6) {
                d = 0;
                c += 3;
            }
        }
        return isValid;
    }
}
