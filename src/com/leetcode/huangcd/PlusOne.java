package com.leetcode.huangcd;

import java.util.Arrays;

/**
 * Date: 12/4/13
 * <p/>
 * Time: 9:14 AM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int size = digits.length;
        int index = firstNotNight(digits);
        int[] result;
        if (index == -1) {
            result = new int[size + 1];
            Arrays.fill(result, 0);
            result[0] = 1;
            return result;
        }
        result = new int[size];
        System.arraycopy(digits, 0, result, 0, size);
        Arrays.fill(result, index + 1, size, 0);
        result[index]++;
        return result;
    }

    private int firstNotNight(int[] digits) {
        int size = digits.length;
        for (int i = size - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                return i;
            }
        }
        return -1;
    }
}
