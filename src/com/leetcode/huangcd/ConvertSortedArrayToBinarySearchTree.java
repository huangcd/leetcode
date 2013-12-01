package com.leetcode.huangcd;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 6:32 PM
 * <p/>
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * @author chhuang at live dot cn
 */
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] num) {
        return sortedArrayToBST(num, 0, num.length);
    }

    private TreeNode sortedArrayToBST(int[] numbers, int fromInclusive, int toExclusive) {
        if (fromInclusive >= toExclusive) {
            return null;
        }
        int mid = (fromInclusive + toExclusive) / 2;
        TreeNode root = new TreeNode(numbers[mid]);
        root.left = sortedArrayToBST(numbers, fromInclusive, mid);
        root.right = sortedArrayToBST(numbers, mid + 1, toExclusive);
        return root;
    }
}
