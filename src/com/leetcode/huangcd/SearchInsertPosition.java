package com.leetcode.huangcd;

/**
 * Date: 11/28/13
 * <p/>
 * Time: 5:04 PM
 * <p/>
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where
 * it would be if it were inserted in order.
 * <p/>
 * You may assume no duplicates in the array.
 * <p/>
 * Here are few examples.
 * <p/>
 * [1,3,5,6], 5 → 2
 * <p/>
 * [1,3,5,6], 2 → 1
 * <p/>
 * [1,3,5,6], 7 → 4
 * <p/>
 * [1,3,5,6], 0 → 0
 *
 * @author chhuang at live dot cn
 */
public class SearchInsertPosition {
    public int searchInsert(int[] A, int target) {
        int from = 0;
        int to = A.length - 1;
        while (true) {
            int mid = (from + to) / 2;
            if (A[mid] == target) {
                return mid;
            }
            if (from >= to) {
                if (target < A[from]) {
                    return from;
                } else {
                    return to + 1;
                }
            }
            if (A[mid] > target) {
                to = mid - 1;
            } else {
                from = mid + 1;
            }
        }
    }
}
