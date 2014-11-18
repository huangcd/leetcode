package com.leetcode.huangcd;

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
        return true;
        // return solve(board, 0, horizontal, vertical, grid);
    }
}
