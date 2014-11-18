package com.leetcode.huangcd;

/**
 * Date: 12/16/13
 * <p/>
 * Time: 1:32 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] A) {
        if (A == null) {
            return 0;
        }
        int length = A.length;
        if (length <= 1) {
            return length;
        }
        int writer = A[0] == A[1] ? 1 : 0;
        int reader = writer + 1;
        while (reader < length) {
            if (A[reader] != A[writer]) {
                writer++;
                A[writer] = A[reader];
                if (reader < length - 1 && A[reader] == A[reader + 1]) {
                    writer++;
                    reader++;
                    A[writer] = A[reader];
                }
            }
            reader++;
        }
        return writer + 1;
    }
}
