package com.leetcode.huangcd;

/**
 * Date: 12/6/13
 * <p/>
 * Time: 9:00 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }
        if (root.left != null) {
            TreeNode leftRightMost = root.left;
            while (leftRightMost.right != null) {
                leftRightMost = leftRightMost.right;
            }
            if (leftRightMost.val >= root.val) {
                return false;
            }
            if (!isValidBST(root.left)) {
                return false;
            }
        }
        if (root.right != null) {
            TreeNode rightLeftMost = root.right;
            while (rightLeftMost.left != null) {
                rightLeftMost = rightLeftMost.left;
            }
            if (rightLeftMost.val <= root.val) {
                return false;
            }
            if (!isValidBST(root.right)) {
                return false;
            }
        }
        return true;
    }
}
