package com.leetcode.huangcd;

/**
 * Date: 11/29/13
 * <p/>
 * Time: 11:28 PM
 * <p/>
 * Find the contiguous subArray within an array (containing at least one number) which has the largest sum.
 * <p/>
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * <p/>
 * the contiguous subArray [4,−1,2,1] has the largest sum = 6.
 * <p/>
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 *
 * @author chhuang at live dot cn
 */
public class MaximumSubArray {
    public int maxSubArray(int[] A) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int n : A) {
            currentSum += n;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
