package com.leetcode.huangcd;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 6:41 PM
 * <p/>
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the
 * sum of all numbers along its path.
 * <p/>
 * Note: You can only move either down or right at any point in time.
 *
 * @author chhuang at live dot cn
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int rowCount = grid.length;
        int columnCount = grid[0].length;
        int[][] sumMatrix = new int[rowCount][columnCount];
        sumMatrix[0][0] = grid[0][0];
        for (int i = 1; i < rowCount; i++) {
            sumMatrix[i][0] = grid[i][0] + sumMatrix[i - 1][0];
        }
        for (int j = 1; j < columnCount; j++) {
            sumMatrix[0][j] = grid[0][j] + sumMatrix[0][j - 1];
        }
        for (int i = 1; i < rowCount; i++) {
            for (int j = 1; j < columnCount; j++) {
                sumMatrix[i][j] = Math.min(sumMatrix[i - 1][j], sumMatrix[i][j - 1]) + grid[i][j];
            }
        }
        return sumMatrix[rowCount - 1][columnCount - 1];
    }
}
