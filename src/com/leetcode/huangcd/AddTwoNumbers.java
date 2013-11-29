package com.leetcode.huangcd;

/**
 * Date: 11/29/13
 * <p/>
 * Time: 10:43 PM
 * <p/>
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p/>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * <p/>
 * Output: 7 -> 0 -> 8
 *
 * @author chhuang at live dot cn
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        int extra = 0;
        ListNode virtualHead = new ListNode(0);
        ListNode pointer = virtualHead;
        while (l1 != null && l2 != null) {
            int value = extra + l1.val + l2.val;
            extra = value >= 10 ? 1 : 0;
            value %= 10;
            pointer.next = new ListNode(value);
            pointer = pointer.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int value = extra + l1.val;
            extra = value >= 10 ? 1 : 0;
            value %= 10;
            pointer.next = new ListNode(value);
            pointer = pointer.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int value = extra + l2.val;
            extra = value >= 10 ? 1 : 0;
            value %= 10;
            pointer.next = new ListNode(value);
            pointer = pointer.next;
            l2 = l2.next;
        }
        if (extra != 0) {
            pointer.next = new ListNode(extra);
        }
        return virtualHead.next;
    }
}
