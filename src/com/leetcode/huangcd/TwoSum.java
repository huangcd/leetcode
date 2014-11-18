package com.leetcode.huangcd;

import java.util.HashMap;

/**
 * Date: 11/28/13
 * <p/>
 * Time: 4:57 PM
 * <p/>
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * <p/>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1
 * must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * <p/>
 * You may assume that each input would have exactly one solution.
 * <p/>
 * Input: numbers={2, 7, 11, 15}, target=9
 * <p/>
 * Output: index1=1, index2=2
 *
 * @author chhuang at live dot cn
 */
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int subtract = target - number;
            if (map.containsKey(subtract)) {
                return new int[]{map.get(subtract), i + 1};
            }
            map.put(number, i + 1);
        }
        return new int[0];
    }
}
