package com.leetcode.huangcd;

import java.util.Arrays;

/**
 * Date: 12/7/13
 * <p/>
 * Time: 3:07 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        short[] horizontal = new short[9];
        short[] vertical = new short[9];
        short[] grid = new short[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int val = 1 << (c - '1');
                    if ((horizontal[i] & val) != 0) {
                        return false;
                    }
                    horizontal[i] |= val;
                    if ((vertical[j] & val) != 0) {
                        return false;
                    }
                    vertical[j] |= val;
                    if ((grid[i / 3 * 3 + j / 3] & val) != 0) {
                        return false;
                    }
                    grid[i / 3 * 3 + j / 3] |= val;
                }
            }
        }
        // Only need to check whether the sudoku is valid or not (not consider whether there is a solution or not)
        return true;
        // return solve(board, 0, horizontal, vertical, grid);
    }

    public boolean solve(char[][] board, int n, short[] horizontal, short[] vertical, short[] grid) {
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
            int val = 1 << (c - '1');
            if ((horizontal[i] & val) == 0 && (vertical[j] & val) == 0 && (grid[i / 3 * 3 + j / 3] & val) != 0) {
                horizontal[i] |= val;
                vertical[j] |= val;
                grid[i / 3 * 3 + j / 3] |= val;
                if (solve(board, n + 1, horizontal, vertical, grid)) {
                    return true;
                }
                horizontal[i] ^= val;
                vertical[j] ^= val;
                grid[i / 3 * 3 + j / 3] ^= val;
            }
            board[i][j] = '.';
        }
        return false;
    }
}
