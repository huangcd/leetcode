package com.leetcode.huangcd;

/**
 * Date: 11/27/13
 * <p/>
 * Time: 5:07 PM
 * <p/>
 * Given a binary tree, find its maximum depth.
 * <p/>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * @author chhuang at live dot cn
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

}
