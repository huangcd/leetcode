package com.leetcode.huangcd;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 11:36 AM
 * <p/>
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p/>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * @author chhuang at live dot cn
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] counts = new int[n + 1];
        counts[0] = 1;
        counts[1] = 1;
        for (int i = 2; i <= n; i++) {
            counts[i] = counts[i - 1] + counts[i - 2];
        }
        return counts[n];
    }
}
