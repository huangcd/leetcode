package com.leetcode.huangcd;

/**
 * Date: 11/28/13
 * <p/>
 * Time: 12:46 PM
 * <p/>
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * <p/>
 * Follow up:
 * <p/>
 * Can you solve it without using extra space?
 *
 * @author chhuang at live dot cn
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (true) {
            if (slow.next == null || fast.next == null || fast.next.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        int cycleCount = 0;
        do {
            slow = slow.next;
            fast = fast.next.next;
            cycleCount++;
        } while (slow != fast);
        ListNode virtualHead = new ListNode(0);
        virtualHead.next = head;
        slow = virtualHead;
        fast = virtualHead;
        for (int i = 0; i < cycleCount; i++) {
            fast = fast.next;
        }
        do {
            slow = slow.next;
            fast = fast.next;
        } while (slow != fast);
        return slow;
    }
}
