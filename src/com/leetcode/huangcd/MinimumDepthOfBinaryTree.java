package com.leetcode.huangcd;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 7:44 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // leaf node
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }
        if (root.right == null) {
            return 1 + minDepth(root.left);
        }
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
