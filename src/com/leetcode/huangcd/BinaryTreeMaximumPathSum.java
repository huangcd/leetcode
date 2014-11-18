package com.leetcode.huangcd;

import java.util.HashMap;

/**
 * Date: 12/3/13
 * <p/>
 * Time: 7:55 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class BinaryTreeMaximumPathSum {
    // KEY1: use global variable to represent multi return
    private int                        currentMax;
    // KEY2: use cache to reduce redundant calculation
    private HashMap<TreeNode, Integer> cache;

    public int maxPathSum(TreeNode root) {
        currentMax = Integer.MIN_VALUE;
        cache = new HashMap<TreeNode, Integer>();
        maxSum(root);
        return currentMax;
    }

    private int maxSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (cache.containsKey(root)) {
            return cache.get(root);
        }
        int leftSum = maxSum(root.left);
        int rightSum = maxSum(root.right);
        currentMax = Math.max(currentMax, Math.max(maxSum(root.left), 0) + Math.max(maxSum(root.right), 0) + root.val);

        int max = Math.max(0, Math.max(leftSum, rightSum)) + root.val;
        cache.put(root, max);
        return max;
    }
}
