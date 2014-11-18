package com.leetcode.huangcd;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 10:03 AM
 * <p/>
 * Reverse digits of an integer.
 * <p/>
 * Example1: x = 123, return 321
 * <p/>
 * Example2: x = -123, return -321
 * <p/>
 * click to show spoilers.
 * <p/>
 * Have you thought about this?
 * <p/>
 * Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!
 * <p/>
 * If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
 * <p/>
 * Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of
 * 1000000003 overflows. How should you handle such cases?
 * <p/>
 * Throw an exception? Good, but what if throwing an exception is not an option? You would then have to re-design the
 * function (ie, add an extra parameter).
 *
 * @author chhuang at live dot cn
 */
public class ReverseInteger {
    public int reverse(int x) {
        boolean negative = x < 0;
        int n = 0;
        x = negative ? -x : x;
        while (x != 0) {
            n = n * 10 + x % 10;
            x /= 10;
        }
        n = negative ? -n : n;
        return n;
    }
}
