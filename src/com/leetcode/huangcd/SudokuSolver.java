package com.leetcode.huangcd;

import java.util.Arrays;

/**
 * Date: 12/15/13
 * <p/>
 * Time: 12:52 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class SudokuSolver {
    public void solveSudoku(char[][] board) {
        solve(board, 0);
    }

    public boolean solve(char[][] board, int n) {
        int i = n / 9;
        int j = n % 9;
        while (n < 81) {
            if (board[i][j] == '.') {
                break;
            }
            n++;
            i = n / 9;
            j = n % 9;
        }
        if (n == 81) {
            return true;
        }
        for (char c = '1'; c <= '9'; c++) {
            board[i][j] = c;
            if (checkValid(board, i, j)) {
                if (solve(board, n + 1)) {
                    return true;
                }
            }
            board[i][j] = '.';
        }
        return false;
    }

    private boolean checkValid(char[][] board, int i, int j) {
        boolean[] used = new boolean[9];
        Arrays.fill(used, false);
        for (int k = 0; k < 9; k++) {
            char c = board[k][j];
            if (c != '.') {
                int val = c - '1';
                if (used[val]) {
                    return false;
                }
                used[val] = true;
            }
        }
        Arrays.fill(used, false);
        for (int k = 0; k < 9; k++) {
            char c = board[i][k];
            if (c != '.') {
                int val = c - '1';
                if (used[val]) {
                    return false;
                }
                used[val] = true;
            }
        }
        Arrays.fill(used, false);
        int baseI = i / 3 * 3;
        int baseJ = j / 3 * 3;
        for (int ii = 0; ii < 3; ii++) {
            for (int jj = 0; jj < 3; jj++) {
                char c = board[baseI + ii][baseJ + jj];
                if (c != '.') {
                    int val = c - '1';
                    if (used[val]) {
                        return false;
                    }
                    used[val] = true;
                }
            }
        }
        return true;
    }
}
