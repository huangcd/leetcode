package com.leetcode.huangcd;

/**
 * Date: 11/27/13
 * Time: 3:08 PM
 *
 * @author chhuang at live dot cn
 */
public class SortList {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pivot = head;
        int value = pivot.val;
        ListNode smaller = null;
        ListNode larger = null;
        head = pivot.next;
        pivot.next = null;
        // partition
        while (head != null) {
            ListNode next = head.next;
            head.next = null;
            if (head.val <= value) {
                head.next = smaller;
                smaller = head;
            } else {
                head.next = larger;
                larger = head;
            }
            head = next;
        }
        // sort smaller part
        smaller = sortList(smaller);
        // sort larger part
        larger = sortList(larger);
        // concatenation three parts
        pivot.next = larger;
        if (smaller == null) {
            return pivot;
        }
        head = smaller;
        while (smaller.next != null) {
            smaller = smaller.next;
        }
        smaller.next = pivot;
        return head;
    }
}
