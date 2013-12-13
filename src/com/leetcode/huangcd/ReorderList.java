package com.leetcode.huangcd;

/**
 * Date: 12/2/13
 * <p/>
 * Time: 6:37 PM
 * <p/>
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 * reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
 * <p/>
 * You must do this in-place without altering the nodes' values.
 * <p/>
 * For example,
 * Given {1,2,3,4}, reorder it to {1,4,2,3}.
 *
 * @author chhuang at live dot cn
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        int size = getSize(head);
        int mid = (size + 1) >> 1;
        ListNode halfPointer = head;
        for (int i = 1; i < mid; i++) {
            halfPointer = halfPointer.next;
        }
        ListNode second = halfPointer.next;
        halfPointer.next = null;
        second = reverse(second);
        ListNode first = head;
        ListNode p, q;
        while (true) {
            p = first.next;
            q = second.next;
            first.next = second;
            second.next = p;
            if (q == null) {
                break;
            }
            first = p;
            second = q;
        }
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head.next;
        // KEY: empty the unused pointer
        head.next = null;
        ListNode q;
        do {
            q = p.next;
            p.next = head;
            head = p;
            p = q;
        } while (q != null);
        return head;
    }

    private int getSize(ListNode head) {
        int size = 0;
        while (head != null) {
            head = head.next;
            size++;
        }
        return size;
    }
}
