package com.leetcode.huangcd;

/**
 * Date: 12/6/13
 * <p/>
 * Time: 9:13 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode vHead = new ListNode(0);
        vHead.next = head;
        int index = 1;
        head = vHead;
        while (index < m) {
            head = head.next;
            index ++;
        }
        ListNode p = head.next;
        ListNode tail = p;
        head.next = null;
        while (index <= n) {
            ListNode q = p.next;
            p.next = head.next;
            head.next = p;
            p = q;
            index ++;
            tail.next = q;
        }
        return vHead.next;
    }
}
