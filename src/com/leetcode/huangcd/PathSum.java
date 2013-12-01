package com.leetcode.huangcd;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 7:13 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (sum == root.val && root.left == null && root.right == null) {
            return true;
        }
        if (root.left != null && hasPathSum(root.left, sum - root.val)) {
            return true;
        }
        if (root.right != null && hasPathSum(root.right, sum - root.val)) {
            return true;
        }
        return false;
    }
}
