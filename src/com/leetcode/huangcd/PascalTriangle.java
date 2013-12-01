package com.leetcode.huangcd;

import java.util.ArrayList;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 6:52 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class PascalTriangle {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<ArrayList<Integer>>();
        }
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();
        triangle.add(new ArrayList<Integer>());
        triangle.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> previous = triangle.get(i - 1);
            ArrayList<Integer> list = new ArrayList<Integer>();
            triangle.add(list);
            list.add(1);
            for (int j = 0; j < i - 1; j++) {
                list.add(previous.get(j) + previous.get(j + 1));
            }
            list.add(1);
        }
        return triangle;
    }
}
