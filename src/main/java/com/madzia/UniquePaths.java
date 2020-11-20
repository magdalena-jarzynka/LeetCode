package com.madzia;

/**
 * Solution for <a href="https://leetcode.com/problems/unique-paths/">Unique Paths</a>
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] board = new int[m][n];
        for (int i = 0; i < m; i++) {
            board [i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            board [0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                board [i][j] = board[i][j - 1] + board[i - 1][j];
            }
        }
        return board[m - 1][n - 1];
    }
}
