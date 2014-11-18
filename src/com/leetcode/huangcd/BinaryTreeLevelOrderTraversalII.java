package com.leetcode.huangcd;

import java.util.ArrayList;

/**
 * Date: 12/3/13
 * <p/>
 * Time: 5:45 PM
 * <p/>
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right,
 * level by level from leaf to root).
 * <p/>
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 * <p/>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * <p/>
 * return its bottom-up level order traversal as:
 * <p/>
 * [
 * [15,7]
 * [9,20],
 * [3],
 * ]
 *
 * @author chhuang at live dot cn
 */
public class BinaryTreeLevelOrderTraversalII {
    public ArrayList<ArrayList<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<ArrayList<Integer>>();
        }
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        ArrayList<TreeNode> level = new ArrayList<TreeNode>();
        level.add(root);
        while (level.size() != 0) {
            ArrayList<Integer> result = new ArrayList<Integer>();
            results.add(0, result);
            ArrayList<TreeNode> newLevel = new ArrayList<TreeNode>();
            for (TreeNode node : level) {
                result.add(node.val);
                if (node.left != null) {
                    newLevel.add(node.left);
                }
                if (node.right != null) {
                    newLevel.add(node.right);
                }
            }
            level = newLevel;
        }
        return results;
    }
}
