package com.leetcode.huangcd;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 6:37 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return compare(root.left, root.right);
    }

    private boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return compare(left.right, right.left) && compare(left.left, right.right);
    }
}
