package com.leetcode.huangcd;

/**
 * Date: 12/4/13
 * <p/>
 * Time: 10:01 PM
 * <p/>
 * You are given an n x n 2D matrix representing an image.
 * <p/>
 * Rotate the image by 90 degrees (clockwise).
 * <p/>
 * Follow up:
 * Could you do this in-place?
 *
 * @author chhuang at live dot cn
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int size = n / 2;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = temp;
            }
        }
        if (n % 2 == 1) {
            int mid = (n - 1) / 2;
            for (int i = 0; i < mid; i++) {
                int temp = matrix[i][mid];
                matrix[i][mid] = matrix[n - 1 - mid][i];
                matrix[n - 1 - mid][i] = matrix[n - 1 - i][n - 1 - mid];
                matrix[n - 1 - i][n - 1 - mid] = matrix[mid][n - 1 - i];
                matrix[mid][n - 1 - i] = temp;
            }
        }
    }
}
