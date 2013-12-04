package com.leetcode.huangcd;

import java.util.ArrayList;

/**
 * Date: 12/4/13
 * <p/>
 * Time: 1:52 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class Combinations {
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        if (n == 0 || k == 0) {
            return new ArrayList<ArrayList<Integer>>();
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= k; i++) {
            list.add(i);
        }
        result.add(new ArrayList<Integer>(list));
        while (hasNext(list, n, k)) {
            list = next(list, n, k);
            result.add(new ArrayList<Integer>(list));
        }
        return result;
    }

    private ArrayList<Integer> next(ArrayList<Integer> list, int n, int k) {
        int index = k - 1;
        while (index >= 0 && list.get(index) == n - (k - 1) + index) {
            index --;
        }
        int val = list.get(index) + 1;
        for (int i = index; i < k; i++) {
            list.set(i, val);
            val ++;
        }
        return list;
    }

    private boolean hasNext(ArrayList<Integer> list, int n, int k) {
        for (int i = 1; i < k; i++) {
            if (list.get(i - 1) + 1 != list.get(i)) {
                return true;
            }
        }
        return list.get(k - 1) != n;
    }
}
