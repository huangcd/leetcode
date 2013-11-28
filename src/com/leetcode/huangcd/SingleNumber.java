package com.leetcode.huangcd;

/**
 * Date: 11/27/13
 * Time: 2:55 PM
 *
 * @author chhuang at live dot cn
 */
public class SingleNumber {

    public int singleNumber(int[] A) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int xorValue = 0;
        for (int a : A) {
            xorValue ^= a;
        }
        return xorValue;
    }
}
