package com.leetcode.huangcd;

/**
 * Date: 12/4/13
 * <p/>
 * Time: 4:32 PM
 * <p/>
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much
 * water it is able to trap after raining.
 * <p/>
 * For example,
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 *
 * @author chhuang at live dot cn
 */
public class TrappingRainWater {
    public int trap(int[] A) {
        int maxIndex = getMaxIndex(A, 0, A.length - 1);
        return processLeft(A, maxIndex) + processRight(A, maxIndex);
    }

    private int getMaxIndex(int[] A, int from, int to) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = from; i <= to; i++) {
            if (A[i] > max) {
                max = A[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private int processLeft(int[] A, int toInclusive) {
        if (toInclusive < 2) {
            return 0;
        }
        int maxIndex = getMaxIndex(A, 0, toInclusive - 1);
        while (toInclusive > 2 && (maxIndex == toInclusive - 1 || A[maxIndex] == A[toInclusive - 1])) {
            toInclusive--;
            maxIndex = getMaxIndex(A, 0, toInclusive - 1);
        }
        int result = processLeft(A, maxIndex);
        for (int i = maxIndex + 1; i < toInclusive; i++) {
            assert (A[i] <= A[maxIndex] && A[i] <= A[toInclusive]);
            result += A[maxIndex] - A[i];
        }
        return result;
    }

    private int processRight(int[] A, int fromInclusive) {
        if (A.length - fromInclusive < 2) {
            return 0;
        }
        int maxIndex = getMaxIndex(A, fromInclusive + 1, A.length - 1);
        while (A.length - fromInclusive > 2 && (maxIndex == fromInclusive + 1 || A[maxIndex] == A[fromInclusive + 1])) {
            fromInclusive++;
            maxIndex = getMaxIndex(A, fromInclusive + 1, A.length - 1);
        }
        int result = processRight(A, maxIndex);
        for (int i = fromInclusive + 1; i < maxIndex; i++) {
            assert (A[i] <= A[maxIndex] && A[i] <= A[fromInclusive]);
            result += A[maxIndex] - A[i];
        }
        return result;
    }
}
