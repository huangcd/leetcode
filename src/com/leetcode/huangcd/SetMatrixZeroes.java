package com.leetcode.huangcd;

import java.util.Arrays;

/**
 * Date: 12/4/13
 * <p/>
 * Time: 9:26 AM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int nonZeroRow = -1;
        int nonZeroColumn = -1;
        for (int i = 0; i < row; i++) {
            boolean hasZero = false;
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == 0) {
                    hasZero = true;
                    break;
                }
            }
            if (!hasZero) {
                nonZeroRow = i;
                break;
            }
        }
        for (int j = 0; j < column; j++) {
            boolean hasZero = false;
            for (int i = 0; i < row; i++) {
                if (matrix[i][j] == 0) {
                    hasZero = true;
                    break;
                }
            }
            if (!hasZero) {
                nonZeroColumn = j;
                break;
            }
        }
        if (nonZeroRow == -1 || nonZeroColumn == -1) {
            for (int i = 0; i < row; i++) {
                Arrays.fill(matrix[i], 0);
            }
            return;
        }
        for (int i = 0; i < row; i++) {
            if (i == nonZeroRow) {
                continue;
            }
            for (int j = 0; j < column; j++) {
                if (j == nonZeroColumn) {
                    continue;
                }
                if (matrix[i][j] == 0) {
                    matrix[nonZeroRow][j] = 0;
                    matrix[i][nonZeroColumn] = 0;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            if (matrix[i][nonZeroColumn] == 0) {
                for (int j = 0; j < column; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < column; j++) {
            if (matrix[nonZeroRow][j] == 0) {
                for (int i = 0; i < row; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
