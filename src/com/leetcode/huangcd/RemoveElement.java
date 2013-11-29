package com.leetcode.huangcd;

/**
 * Date: 11/29/13
 * <p/>
 * Time: 11:15 PM
 * <p/>
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * <p/>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 * @author chhuang at live dot cn
 */
public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        int fast = 0;
        int slow = -1;
        while (fast < A.length) {
            if (A[fast] != elem) {
                slow++;
                A[slow] = A[fast];
            }
            fast++;
        }
        return slow + 1;
    }
}
