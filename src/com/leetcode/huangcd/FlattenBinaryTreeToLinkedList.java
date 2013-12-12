package com.leetcode.huangcd;

/**
 * Date: 12/6/13
 * <p/>
 * Time: 5:29 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class FlattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }
        if (root.left != null) {
            TreeNode leftRightMost = root.left;
            while (leftRightMost.right != null) {
                leftRightMost = leftRightMost.right;
            }
            leftRightMost.right = root.right;
            root.right = root.left;
            root.left = null;
        }
        flatten(root.right);
    }
}
