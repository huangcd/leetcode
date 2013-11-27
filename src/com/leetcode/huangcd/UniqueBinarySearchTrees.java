package com.leetcode.huangcd;

/**
 * Date: 11/27/13
 * Time: 5:19 PM
 *
 * @author chhuang@microsoft.com
 *
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 *
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.
 *
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3
 */
public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        int[] numbers = new int[n + 1];
        numbers[0] = 1;
        for (int i = 1; i <= n; i++) {
            int total = 0;
            for (int j = 1; j <= i; j++) {
                total += numbers[j - 1] * numbers[i - j];
            }
            numbers[i] = total;
        }
        return numbers[n];
    }
}
