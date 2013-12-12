package com.leetcode.huangcd;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Date: 12/11/13
 * <p/>
 * Time: 4:35 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if (lists == null || lists.isEmpty()) {
            return null;
        }
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.size(), new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                int x = o1.val;
                int y = o2.val;
                return (x < y) ? -1 : ((x == y) ? 0 : 1);
            }
        });
        for (ListNode node : lists) {
            if (node != null) {
                queue.add(node);
            }
        }
        ListNode virtualHead = new ListNode(0);
        ListNode p = virtualHead;
        while (!queue.isEmpty()) {
            ListNode list = queue.poll();
            p.next = list;
            p = list;
            list = list.next;
            p.next = null;
            if (list != null) {
                queue.offer(list);
            }
        }
        return virtualHead.next;
    }
}
