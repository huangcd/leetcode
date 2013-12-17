package com.leetcode.huangcd;

import java.util.Arrays;

/**
 * Date: 12/17/13
 * <p/>
 * Time: 7:33 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class NQueensII {
    public int totalNQueens(int n) {
        boolean[] diagonal = new boolean[n * 2 - 1];
        boolean[] revDiagonal = new boolean[n * 2 - 1];
        boolean[] vertical = new boolean[n];
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        return solve(board, 0, n, vertical, diagonal, revDiagonal);
    }

    private int solve(char[][] board, int index, int n, boolean[] vertical, boolean[] diagonal, boolean[] revDiagonal) {
        if (index == n) {
            return 1;
        }
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (vertical[j] || diagonal[index + j] || revDiagonal[index - j + n - 1]) {
                continue;
            }
            vertical[j] = diagonal[index + j] = revDiagonal[index - j + n - 1] = true;
            board[index][j] = 'Q';
            count += solve(board, index + 1, n, vertical, diagonal, revDiagonal);
            board[index][j] = '.';
            vertical[j] = diagonal[index + j] = revDiagonal[index - j + n - 1] = false;
        }
        return count;
    }
}
