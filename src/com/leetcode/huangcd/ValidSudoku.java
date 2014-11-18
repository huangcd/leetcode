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
    private boolean[] used = new boolean[9];

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    boolean valid = false;
                    for (char k = '1'; k <= '9'; k++) {
                        board[i][j] = k;
                        if (checkValid(board, i, j)) {
                            valid = true;
                            if (!isValidSudoku(board)) {
                                return false;
                            }
                        }
                    }
                    if (!valid) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean checkValid(char[][] board, int i, int j) {
        Arrays.fill(used, false);
        for (int k = 0; k < 9; k++) {
            char c = board[k][j];
            if (c != '.') {
                int val = c - '0';
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
                int val = c - '0';
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
                    int val = c - '0';
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
