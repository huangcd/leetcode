package com.leetcode.huangcd;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 7:18 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class PathSumII {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        travel(root, sum, new Stack<Integer>(), result);
        return result;
    }

    private void travel(TreeNode root, int sum, Stack<Integer> stack, ArrayList<ArrayList<Integer>> result) {
        if (root == null) {
            return;
        }
        if (sum == root.val && root.left == null && root.right == null) {
            ArrayList<Integer> list = new ArrayList<Integer>(stack);
            list.add(root.val);
            result.add(list);
        }
        stack.push(root.val);
        travel(root.left, sum - root.val, stack, result);
        travel(root.right, sum - root.val, stack, result);
        stack.pop();
    }
}
