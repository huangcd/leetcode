package com.leetcode.huangcd;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 10:21 AM
 * <p/>
 * Given a binary tree
 * <p/>
 * struct TreeLinkNode {
 * TreeLinkNode *left;
 * TreeLinkNode *right;
 * TreeLinkNode *next;
 * }
 * <p/>
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer
 * should be set to NULL.
 * <p/>
 * Initially, all next pointers are set to NULL.
 * <p/>
 * Note:
 * <p/>
 * You may only use constant extra space.
 * You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two
 * children).
 * <p/>
 * For example,
 * Given the following perfect binary tree,
 * <p/>
 * 1
 * /  \
 * 2    3
 * / \  / \
 * 4  5  6  7
 * <p/>
 * After calling your function, the tree should look like:
 * <p/>
 * 1 -> NULL
 * /  \
 * 2 -> 3 -> NULL
 * / \  / \
 * 4->5->6->7 -> NULL
 *
 * @author chhuang at live dot cn
 */
public class PopulatingNextRightPointersInEachNode {
    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null && root.right != null) {
            TreeLinkNode left = root.left;
            TreeLinkNode right = root.right;
            while (left != null && right != null) {
                left.next = right;
                left = left.right;
                right = right.left;
            }
            connect(root.left);
            connect(root.right);
        }
    }
}
