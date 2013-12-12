package com.leetcode.huangcd;

/**
 * Date: 12/11/13
 * <p/>
 * Time: 4:22 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        int sizeA = a.length();
        int sizeB = b.length();
        int sizeC = Math.max(sizeA, sizeB) + 1;
        char[] chars = new char[sizeC];
        int min = Math.min(sizeA, sizeB);
        int carry = 0;
        for (int i = 1; i <= min; i++) {
            int val = a.charAt(sizeA - i) - '0' + b.charAt(sizeB - i) - '0' + carry;
            if (val > 1) {
                carry = 1;
                val -= 2;
            } else {
                carry = 0;
            }
            chars[sizeC - i] = (char) (val + '0');
        }
        if (sizeA == min) {
            for (int i = min + 1; i <= sizeB; i++) {
                int val = b.charAt(sizeB - i) - '0' + carry;
                if (val > 1) {
                    carry = 1;
                    val -= 2;
                } else {
                    carry = 0;
                }
                chars[sizeC - i] = (char) (val + '0');
            }
        }
        if (sizeB == min) {
            for (int i = min + 1; i <= sizeA; i++) {
                int val = a.charAt(sizeA - i) - '0' + carry;
                if (val > 1) {
                    carry = 1;
                    val -= 2;
                } else {
                    carry = 0;
                }
                chars[sizeC - i] = (char) (val + '0');
            }
        }
        if (carry == 1) {
            chars[0] = '1';
            return new String(chars);
        } else {
            return new String(chars, 1, sizeC - 1);
        }
    }
}
