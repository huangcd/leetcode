package com.leetcode.huangcd;

import java.util.ArrayList;
import java.util.List;

/**
 * Date: 11/27/13
 * Time: 3:08 PM
 *
 * @author chhuang@microsoft.com
 */
public class SortList {

    public static List<Integer> listNodeToList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list;
    }

    public static ListNode listToListNode(List<Integer> list) {
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

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        @Override
        public String toString() {
            return val + ", " + (next == null ? "" : next.toString());
        }
    }
}
