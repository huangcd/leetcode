package com.leetcode.huangcd;

/**
 * Date: 12/6/13
 * <p/>
 * Time: 4:45 PM
 * <p/>
 * Sort a linked list using insertion sort.
 *
 * @author chhuang@microsoft.com
 */
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head.next;
        head.next = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = null;
            if (current.val < head.val) {
                current.next = head;
                head = current;
            } else {
                ListNode pointer = head;
                while (pointer.next != null && pointer.next.val <= current.val) {
                    pointer = pointer.next;
                }
                current.next = pointer.next;
                pointer.next = current;
            }
            current = next;
        }
        return head;
    }
}
