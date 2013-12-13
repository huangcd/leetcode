package com.leetcode.huangcd;

/**
 * Date: 12/13/13
 * <p/>
 * Time: 6:58 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        if (end < 0) {
            return 0;
        }
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;
    }
}
