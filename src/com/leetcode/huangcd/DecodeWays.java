package com.leetcode.huangcd;

/**
 * Date: 12/15/13
 * <p/>
 * Time: 11:17 AM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class DecodeWays {
    public int numDecodings(String s) {
        if (s == null) {
            return 0;
        }
        int size = s.length();
        if (size == 0) {
            return 0;
        }
        if (s.charAt(0) == '0') {
            return 0;
        }
        if (size == 1) {
            return 1;
        }
        char[] chars = s.toCharArray();
        int[] lastSingle = new int[size + 1];
        int[] lastDouble = new int[size + 1];
        lastSingle[0] = 0;
        lastSingle[1] = 1;
        lastDouble[0] = lastDouble[1] = 0;
        return 0;
    }
}
