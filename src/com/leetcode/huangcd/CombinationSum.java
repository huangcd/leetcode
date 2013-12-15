package com.leetcode.huangcd;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Date: 12/15/13
 * <p/>
 * Time: 10:23 AM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class CombinationSum {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        combinationSum(candidates, target, new int[candidates.length], 0, 0, result);
        return result;
    }

    private void combinationSum(
            int[] candidates,
            int target,
            int[] candidateCounts,
            int startIndex,
            int sum,
            ArrayList<ArrayList<Integer>> outResult) {
        int size = candidates.length;
        if (sum == target) {
            ArrayList<Integer> answer = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                for (int c = 0; c < candidateCounts[i]; c++) {
                    answer.add(candidates[i]);
                }
            }
            if (answer.size() > 0) {
                outResult.add(answer);
            }
        } else if (sum < target) {
            for (int i = startIndex; i < size; i++) {
                candidateCounts[i]++;
                sum += candidates[i];
                combinationSum(candidates, target, candidateCounts, i, sum, outResult);
                sum -= candidates[i];
                candidateCounts[i]--;
            }
        }
    }
}
