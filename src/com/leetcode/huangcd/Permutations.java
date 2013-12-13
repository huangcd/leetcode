package com.leetcode.huangcd;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Date: 12/6/13
 * <p/>
 * Time: 7:12 PM
 * <p/>
 * Given a collection of numbers, return all possible permutations.
 * <p/>
 * For example,
 * [1,2,3] have the following permutations:
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 *
 * @author chhuang at live dot cn
 */
public class Permutations {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int n = num.length;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(num[array[i]]);
        }
        result.add(list);
        while (hasNext(array)) {
            next(array);
            list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(num[array[i]]);
            }
            result.add(list);
        }
        return result;
    }

    private void next(int[] list) {
        int n = list.length;
        int index = n - 1;
        while (index > 0 && list[index] < list[index - 1]) {
            index--;
        }
        if (index != 0) {
            int swapIndex = n - 1;
            while (list[swapIndex] < list[index - 1]) {
                swapIndex--;
            }
            swap(list, index - 1, swapIndex);
            Arrays.sort(list, index, n);
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private boolean hasNext(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i] != n - i - 1) {
                return true;
            }
        }
        return false;
    }
}
