package com.leetcode.huangcd;

/**
 * Date: 12/13/13
 * <p/>
 * Time: 3:11 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strings) {
        if (strings.length == 0) {
            return "";
        }
        int minLength = Integer.MAX_VALUE;
        for (String string : strings) {
            minLength = Math.min(minLength, string.length());
        }
        char[] chars = new char[minLength];
        int index = 0;
        for (; index < minLength; index++) {
            char c = strings[0].charAt(index);
            boolean sameChar = true;
            for (String string : strings) {
                if (c != string.charAt(index)) {
                    sameChar = false;
                    break;
                }
            }
            if (sameChar) {
                chars[index] = c;
            } else {
                break;
            }
        }
        return new String(chars, 0, index);
    }
}
