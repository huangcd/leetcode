package com.leetcode.huangcd;

import java.util.HashMap;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 2:22 PM
 * <p/>
 * Given a binary tree, determine if it is height-balanced.
 * <p/>
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * @author chhuang at live dot cn
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return isBalancedInternal(root, new HashMap<TreeNode, Integer>());
    }

    private boolean isBalancedInternal(TreeNode root, HashMap<TreeNode, Integer> cache) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right != null && (root.right.left != null || root.right.right != null))
        {
            return false;
        }
        if (root.right == null && root.left != null && (root.left.left != null || root.left.right != null)) {
            return false;
        }
        return Math.abs(getHeight(root.left, cache) - getHeight(root.right, cache)) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right)
                ;
    }

    public int getHeight(TreeNode root, HashMap<TreeNode, Integer> cache) {
        if (root == null) {
            return 0;
        }
        if (cache.containsKey(root)) {
            return cache.get(root);
        }

        int height = 1 + Math.max(getHeight(root.left, cache), getHeight(root.right, cache));
        cache.put(root, height);
        return height;
    }
}
