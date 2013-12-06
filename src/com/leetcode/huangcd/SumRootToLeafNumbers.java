package com.leetcode.huangcd;

/**
 * Date: 12/6/13
 * <p/>
 * Time: 5:00 PM
 * <p/>
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 * <p/>
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * <p/>
 * Find the total sum of all root-to-leaf numbers.
 * <p/>
 * For example,
 * <p/>
 * &nbsp;1
 * <p/>
 * &nbsp;/&nbsp;\
 * <p/>
 * 2&nbsp;&nbsp;3
 * <p/>
 * The root-to-leaf path 1->2 represents the number 12.
 * The root-to-leaf path 1->3 represents the number 13.
 * <p/>
 * Return the sum = 12 + 13 = 25.
 *
 * @author chhuang@microsoft.com
 */
public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }

    private int sumNumbers(TreeNode root, int base) {
        if (root == null) {
            return 0;
        }
        // leaf
        if (root.left == null && root.right == null) {
            return base * 10 + root.val;
        }
        int result = 0;
        base = base * 10 + root.val;
        if (root.left != null) {
            result += sumNumbers(root.left, base);
        }
        if (root.right != null) {
            result += sumNumbers(root.right, base);
        }
        return result;
    }
}
