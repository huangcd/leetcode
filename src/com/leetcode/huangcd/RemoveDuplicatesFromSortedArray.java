package com.leetcode.huangcd;

/**
 * Date: 11/29/13
 * <p/>
 * Time: 11:05 PM
 * <p/>
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new
 * length.
 * <p/>
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p/>
 * For example,
 * Given input array A = [1,1,2],
 * <p/>
 * Your function should return length = 2, and A is now [1,2].
 *
 * @author chhuang at live dot cn
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int fast = 1;
        int slow = 0;
        while (fast < A.length) {
            if (A[fast] != A[slow]) {
                slow++;
                A[slow] = A[fast];
            }
            fast++;
        }
        return slow + 1;
    }
}
