package com.leetcode.huangcd;

/**
 * Date: 11/27/13
 * Time: 5:49 PM
 *
 * @author chhuang at live dot cn
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    TreeNode(int x) {
        val = x;
    }
}
