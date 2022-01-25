package com.codewars.sudokuValidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SudokuValidatorTest {

    @Test
    void validate() {
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        assertEquals(true, SudokuValidator.validate(sudoku));

        sudoku[0][0]++;
        sudoku[1][1]++;
        sudoku[0][1]--;
        sudoku[1][0]--;

        assertEquals(false, SudokuValidator.validate(sudoku));

        sudoku[0][0]--;
        sudoku[1][1]--;
        sudoku[0][1]++;
        sudoku[1][0]++;

        sudoku[4][4] = 0;

        assertEquals(false, SudokuValidator.validate(sudoku));
    }
    @Test
    void validate1() {
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2, 10},
                {6, 7, 2, 1, 9, 5, 3, 4, 8, 11},
                {1, 9, 8, 3, 4, 2, 5, 6, 7, 12},
                {8, 5, 9, 7, 6, 1, 4, 2, 3, 13},
                {4, 2, 6, 8, 5, 3, 7, 9, 1, 14},
                {7, 1, 3, 9, 2, 4, 8, 5, 6, 15},
                {9, 6, 1, 5, 3, 7, 2, 8, 4, 16},
                {2, 8, 7, 4, 1, 9, 6, 3, 5, 17},
                {3, 4, 5, 2, 8, 6, 1, 7, 9, 18},
                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30}
        };

        assertEquals(false, SudokuValidator.validate(sudoku));
    }
    @Test
    void validate2() {
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2, 10},
                {6, 7, 2, 1, 9, 5, 3, 4, 8, 11},
                {1, 9, 8, 3, 4, 2, 5, 6, 7, 12},
                {8, 5, 9, 7, 6, 1, 4, 2, 3, 13},
                {4, 2, 6, 8, 5, 3, 7, 9, 1, 14},
                {7, 1, 3, 9, 2, 4, 8, 5, 6, 15},
                {9, 6, 1, 5, 3, 7, 2, 8, 4, 16},
                {2, 8, 7, 4, 1, 9, 6, 3, 5, 17},
                {3, 4, 5, 2, 8, 6, 1, 7, 9, 18},
        };
        assertEquals(false, SudokuValidator.validate(sudoku));
    }
    @Test
    void validate3() {
        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9},
                {21, 22, 23, 24, 25, 26, 27, 28, 29}
        };
        assertEquals(false, SudokuValidator.validate(sudoku));
    }
}