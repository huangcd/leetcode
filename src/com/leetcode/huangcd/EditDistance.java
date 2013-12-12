package com.leetcode.huangcd;

/**
 * Date: 12/9/13
 * <p/>
 * Time: 9:14 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class EditDistance {
    public int minDistance(String word1, String word2) {
        int length1 = word1.length() + 1;
        int length2 = word2.length() + 1;
        int[][] matrix = new int[length1][length2];
        for (int i = 1; i < length1; i++) {
            matrix[i][0] = i;
        }
        for (int j = 1; j < length2; j++) {
            matrix[0][j] = j;
        }
        for (int i = 1; i < length1; i++) {
            for (int j = 1; j < length2; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    matrix[i][j] = matrix[i - 1][j - 1];
                } else {
                    matrix[i][j] = Math.min(matrix[i][j - 1], Math.min(matrix[i - 1][j], matrix[i - 1][j - 1])) + 1;
                }
            }
        }
        return matrix[word1.length()][word2.length()];
    }
}
