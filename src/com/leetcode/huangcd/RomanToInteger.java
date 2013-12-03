package com.leetcode.huangcd;

/**
 * Date: 12/3/13
 * <p/>
 * Time: 5:25 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class RomanToInteger {
    private static int toNum(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public int romanToInt(String s) {
        int size = s.length();
        int result = 0;
        for (int i = 0, max = size - 1; i < max; i++) {
            if (toNum(s.charAt(i)) >= toNum(s.charAt(i + 1))) {
                result += toNum(s.charAt(i));
            }
            else {
                result -= toNum(s.charAt(i));
            }
        }
        result += toNum(s.charAt(size - 1));
        return result;
    }
}
