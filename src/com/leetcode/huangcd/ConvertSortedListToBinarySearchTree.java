package com.leetcode.huangcd;

/**
 * Date: 12/6/13
 * <p/>
 * Time: 5:13 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }
        if (head.next.next == null) {
            TreeNode root = new TreeNode(head.val);
            root.right = new TreeNode(head.next.val);
            return root;
        }
        int length = getLength(head);
        int mid = (length >> 1);
        ListNode p = head;
        while (mid > 1) {
            p = p.next;
            mid --;
        }
        TreeNode root = new TreeNode(p.next.val);
        root.right = sortedListToBST(p.next.next);
        p.next = null;
        root.left = sortedListToBST(head);
        return root;
    }

    private int getLength(ListNode head) {
        int i = 0;
        while (head != null) {
            head = head.next;
            i ++;
        }
        return i;
    }
}
