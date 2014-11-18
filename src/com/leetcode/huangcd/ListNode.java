package com.leetcode.huangcd;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 11/27/13
 * Time: 5:47 PM
 *
 * @author chhuang at live dot cn
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }

    public static List<Integer> toList(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list;
    }

    public static ListNode fromArray(int... array) {
        if (array == null || array.length == 0) {
            return null;
        }
        ListNode head = new ListNode(array[0]);
        ListNode current = head;
        for (int i = 1; i < array.length; i++) {
            current.next = new ListNode(array[i]);
            current = current.next;
        }
        return head;
    }

    public static ListNode fromList(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ListNode head = new ListNode(list.get(0));
        ListNode current = head;
        for (int i = 1; i < list.size(); i++) {
            current.next = new ListNode(list.get(i));
            current = current.next;
        }
        return head;
    }

    public List<Integer> toList() {
        return toList(this);
    }

    public Integer[] toArray() {
        List<Integer> integers = toList(this);
        return integers.toArray(new Integer[integers.size()]);
    }

    @Override
    public String toString() {
        return val + ", " + (next == null ? "" : next.toString());
    }
}
