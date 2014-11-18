package com.leetcode.huangcd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Date: 12/15/13
 * <p/>
 * Time: 10:54 AM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class SubsetsII {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        if (num == null || num.length == 0) {
            return new ArrayList<ArrayList<Integer>>();
        }
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int n : num) {
            if (!counts.containsKey(n)) {
                counts.put(n, 1);
            } else {
                counts.put(n, counts.get(n) + 1);
            }
        }
        int[] keys = new int[counts.size()];
        int index = 0;
        for (int key : counts.keySet()) {
            keys[index] = key;
            index++;
        }
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        int length = keys.length;
        long power = 1L << length;
        Arrays.sort(keys);
        for (long i = 0; i < power; i++) {
            ArrayList<Integer> set = new ArrayList<Integer>();
            for (int j = 0; j < length; j++) {
                if (((1 << j) & i) != 0) {
                    set.add(keys[j]);
                }
            }
            // TODO add multisets
        }
        return results;

    }
}
