package com.leetcode.huangcd;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 1:38 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode virtualHead = new ListNode(0);
        virtualHead.next = head;
        ListNode p = virtualHead;
        ListNode q = p.next;
        ListNode r = q.next;
        while (true) {
            p.next = r;
            q.next = r.next;
            r.next = q;
            p = q;
            if (p.next == null) {
                break;
            }
            q = p.next;
            if (q.next == null) {
                break;
            }
            r = q.next;
        }
        return virtualHead.next;
    }
}
