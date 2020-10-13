package com.madzia;

import java.util.HashSet;
import java.util.Set;

/**
 * Solution for <a href="https://leetcode.com/problems/valid-sudoku/">Valid Sudoku</a>
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> charSet = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!addOrSkipElement(board, charSet, i, j)) return false;
            }
            charSet = new HashSet<>();
        }

        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                if (!addOrSkipElement(board, charSet, i, j)) return false;
            }
            charSet = new HashSet<>();
        }

        for (int n = 0; n < 9; n = n + 3) {
            for (int m = 0; m < 9; m = m + 3) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (!addOrSkipElement(board, charSet, n + i, m + j)) return false;
                    }
                }
                charSet = new HashSet<>();
            }
        }

        return true;
    }

    private boolean addOrSkipElement(char[][] board, Set<Character> charSet, int i, int j) {
        return board[i][j] == '.' || charSet.add(board[i][j]);
    }
}
