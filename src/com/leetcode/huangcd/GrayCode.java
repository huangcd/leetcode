package com.leetcode.huangcd;

import java.util.ArrayList;

/**
 * Date: 12/16/13
 * <p/>
 * Time: 10:47 AM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class GrayCode {
    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>(1 << n);
        result.add(0);
        for (int i = 0; i < n; i++) {
            int extra = 1 << i;
            int size = result.size();
            for (int j = 1; j <= size; j++) {
                result.add(extra | result.get(size - j));
            }
        }
        return result;
    }
}
