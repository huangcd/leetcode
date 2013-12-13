package com.leetcode.huangcd;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Date: 12/9/13
 * <p/>
 * Time: 9:03 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class Subsets {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        if (S == null || S.length == 0) {
            return new ArrayList<ArrayList<Integer>>();
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int length = S.length;
        long count = 1L << length;
        Arrays.sort(S);
        for (long i = 0; i < count; i++) {
            ArrayList<Integer> set = new ArrayList<Integer>();
            result.add(set);
            for (int j = 0; j < length; j++) {
                if (((1 << j) & i) != 0) {
                    set.add(S[j]);
                }
            }
        }
        return result;
    }
}
