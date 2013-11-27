package com.leetcode.huangcd;

/**
 * Date: 11/27/13
 * Time: 5:33 PM
 *
 * @author chhuang@microsoft.com
 *         <p/>
 *         Given a sorted linked list, delete all duplicates such that each element appear only once.
 *         <p/>
 *         For example,
 *         Given 1->1->2, return 1->2.
 *         Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }
}
