package com.leetcode.huangcd;

/**
 * Date: 12/13/13
 * <p/>
 * Time: 7:30 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode smaller = new ListNode(0);
        ListNode larger = new ListNode(0);
        ListNode smallPointer = smaller;
        ListNode largerPointer = larger;
        while (head != null) {
            if (head.val >= x) {
                largerPointer.next = head;
                largerPointer = head;
                head = head.next;
                largerPointer.next = null;
            } else {
                smallPointer.next = head;
                smallPointer = head;
                head = head.next;
                smallPointer.next = null;
            }
        }
        smallPointer.next = larger.next;
        return smaller.next;
    }
}
