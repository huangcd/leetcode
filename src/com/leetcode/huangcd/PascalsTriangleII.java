package com.leetcode.huangcd;

import java.util.ArrayList;

/**
 * Date: 12/16/13
 * <p/>
 * Time: 1:41 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class PascalsTriangleII {
    public ArrayList<Integer> getRow(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i <= rowIndex; i++) {
            int lastValue = 0;
            for (int j = 0; j < i; j++) {
                int temp = result.get(j);
                result.set(j, temp + lastValue);
                lastValue = temp;
            }
            result.add(1);
        }
        return result;
    }
}
