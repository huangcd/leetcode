package com.leetcode.huangcd;

/**
 * Date: 11/27/13
 * Time: 2:55 PM
 *
 * @author chhuang at live dot cn
 */
public class SingleNumberII {

    public int singleNumber(int[] A) {
        int xorValue = 0;
        for (int a : A) {
            xorValue ^= a;
        }
        return xorValue;
    }
}
