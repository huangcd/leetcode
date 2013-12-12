package com.leetcode.huangcd;

/**
 * Date: 12/9/13
 * <p/>
 * Time: 2:26 PM
 * <p/>
 * Divide two integers without using multiplication, division and mod operator.
 *
 * @author chhuang@microsoft.com
 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        int sign = ((dividend >>> 31) ^ (divisor >>> 31)) == 1 ? -1 : 1;
        long dividendLong = Math.abs(dividend);
        long divisorLong = Math.abs(divisor);
        int result = 0;
        while (divisorLong < dividendLong) {
            int val = 1;
            long div = divisorLong;
            while ((div << 1) <= dividendLong) {
                div <<= 1;
                val <<= 1;
            }
            result |= val;
            dividendLong -= div;
        }
        return result * sign;
    }
}
