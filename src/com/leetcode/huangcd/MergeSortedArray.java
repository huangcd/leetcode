package com.leetcode.huangcd;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 6:24 PM
 * <p/>
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * <p/>
 * Note:
 * You may assume that A has enough space to hold additional elements from B. The number of elements initialized in A and B are m and n respectively.
 *
 * @author chhuang at live dot cn
 */
public class MergeSortedArray {
    public void merge(int A[], int m, int B[], int n) {
        int count = m + n;
        m--;
        n--;
        for (int i = count - 1; i >= 0; i--) {
            if (m < 0) {
                A[i] = B[n];
                n--;
            } else if (n < 0) {
                A[i] = A[m];
                m--;
            } else if (A[m] > B[n]) {
                A[i] = A[m];
                m--;
            } else {
                A[i] = B[n];
                n--;
            }
        }
    }
}
