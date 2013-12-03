package com.leetcode.huangcd;

/**
 * Date: 12/3/13
 * <p/>
 * Time: 7:48 PM
 * <p/>
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * <p/>
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * <p/>
 * How many possible unique paths are there?
 *
 * @author chhuang@microsoft.com
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        return c(m + n - 2, Math.min(m, n) - 1);
    }

    private int c(int total, int select) {
        long result = 1;
        for (int i = 1; i <= select; i++) {
            result = result * (total + 1 - i) / i;
        }
        return (int)result;
    }
}
