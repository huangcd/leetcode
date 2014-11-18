package com.leetcode.huangcd;

/**
 * Date: 11/27/13
 * Time: 2:55 PM
 *
 * @author chhuang at live dot cn
 */
public class SingleNumberII {

    public int singleNumber(int[] A) {
        final int wordLength = 32;
        byte[] xor3Bytes = new byte[wordLength];
        for (int n : A) {
            for (int i = 0; i < wordLength; i++) {
                if ((n & (1 << i)) != 0) {
                    xor3Bytes[i]++;
                    if (xor3Bytes[i] == 3) {
                        xor3Bytes[i] = 0;
                    }
                }
            }
        }
        int value = 0;
        for (int i = 0; i < wordLength; i++) {
            if (xor3Bytes[i] != 0) {
                value |= (1 << i);
            }
        }
        return value;
    }
}
