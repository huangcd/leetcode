package com.leetcode.huangcd;

/**
 * Date: 11/28/13
 * <p/>
 * Time: 9:10 AM
 * <p/>
 * Given a linked list, determine if it has a cycle in it.
 * <p/>
 * Follow up:
 * <p/>
 * Can you solve it without using extra space?
 *
 * @author chhuang@microsoft.com
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (true) {
            if (slow.next == null || fast.next == null || fast.next.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
    }
}
