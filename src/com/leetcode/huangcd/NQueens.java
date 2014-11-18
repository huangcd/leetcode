package com.leetcode.huangcd;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Date: 12/17/13
 * <p/>
 * Time: 7:33 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class NQueens {
    public ArrayList<String[]> solveNQueens(int n) {
        ArrayList<String[]> results = new ArrayList<String[]>();
        boolean[] diagonal = new boolean[n * 2 - 1];
        boolean[] revDiagonal = new boolean[n * 2 - 1];
        boolean[] vertical = new boolean[n];
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        solve(board, 0, n, vertical, diagonal, revDiagonal, results);
        return results;
    }

    private void solve(char[][] board, int index, int n, boolean[] vertical, boolean[] diagonal, boolean[] revDiagonal, ArrayList<String[]> results) {
        if (index == n) {
            results.add(toString(board, n));
        }
        for (int j = 0; j < n; j++) {
            if (vertical[j] || diagonal[index + j] || revDiagonal[index - j + n - 1]) {
                continue;
            }
            vertical[j] = diagonal[index + j] = revDiagonal[index - j + n - 1] = true;
            board[index][j] = 'Q';
            solve(board, index + 1, n, vertical, diagonal, revDiagonal, results);
            board[index][j] = '.';
            vertical[j] = diagonal[index + j] = revDiagonal[index - j + n - 1] = false;
        }
    }

    private String[] toString(char[][] board, int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[i] = new String(board[i]);
        }
        return result;
    }
}
