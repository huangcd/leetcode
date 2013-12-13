package com.leetcode.huangcd;

/**
 * Date: 12/13/13
 * <p/>
 * Time: 1:00 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int x = 0;
        int y = 0;
        int value = 1;
        int k = n - 1;
        while (k > 0) {
            for (int i = 0; i < k; i++) {
                matrix[x][y] = value;
                value++;
                y++;
            }
            for (int i = 0; i < k; i++) {
                matrix[x][y] = value;
                value++;
                x++;
            }
            for (int i = 0; i < k; i++) {
                matrix[x][y] = value;
                value++;
                y--;
            }
            for (int i = 0; i < k; i++) {
                matrix[x][y] = value;
                value++;
                x--;
            }
            x++;
            y++;
            k -= 2;
        }
        if (k == 0) {
            matrix[x][y] = value;
        }
        return matrix;
    }
}
