package com.leetcode.huangcd;

/**
 * Date: 11/27/13
 * <p/>
 * Time: 5:40 PM
 * <p/>
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * @author chhuang at live dot cn
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head = null, current = null;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                if (head == null) {
                    head = l1;
                    current = l1;
                } else {
                    current.next = l1;
                    current = l1;
                }
                l1 = l1.next;
            } else {
                if (head == null) {
                    head = l2;
                    current = l2;
                } else {
                    current.next = l2;
                    current = l2;
                }
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }
        return head;
    }
}
