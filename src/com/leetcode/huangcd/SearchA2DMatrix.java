package com.leetcode.huangcd;

import java.util.Arrays;

/**
 * Date: 12/4/13
 * <p/>
 * Time: 8:50 AM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        if (target < matrix[0][0]) {
            return false;
        }
        if (target == matrix[0][0]) {
            return true;
        }
        if (target > matrix[n - 1][m - 1]) {
            return false;
        }
        if (target == matrix[n - 1][m - 1]) {
            return true;
        }
        int n1 = 0, n2 = n;
        while (n1 < n2) {
            int nn = (n1 + n2) / 2;
            if (matrix[nn][0] <= target && target <= matrix[nn][m - 1]) {
                return Arrays.binarySearch(matrix[nn], target) >= 0;
            }
            if (matrix[nn][0] > target) {
                n2 = nn;
            }
            else if (matrix[nn][m - 1] < target) {
                n1 = nn + 1;
            }
        }
        return false;
    }
}
