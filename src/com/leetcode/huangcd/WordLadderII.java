package com.leetcode.huangcd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Date: 12/4/13
 * <p/>
 * Time: 9:18 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class WordLadderII {

    private boolean close(String src, String dest) {
        int size = src.length();
        int diff = 0;
        for (int i = 0; i < size; i++) {
            if (src.charAt(i) != dest.charAt(i)) {
                diff++;
                if (diff == 2) {
                    return false;
                }
            }
        }
        return diff <= 1;
    }
}
