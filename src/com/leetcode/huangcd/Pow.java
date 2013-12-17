package com.leetcode.huangcd;

/**
 * Date: 12/16/13
 * <p/>
 * Time: 11:11 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class Pow {
    public double pow(double x, int n) {
        if (x == 1) {
            return 1;
        }
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n == Integer.MIN_VALUE) {
            return 1 / x / pow(x, Integer.MAX_VALUE);
        }
        if (n < 0) {
            return 1 / pow(x, -n);
        }
        double half = pow(x, n >> 1);
        if ((n & 1) != 0) {
            return half * half * x;
        } else {
            return half * half;
        }
    }
}
