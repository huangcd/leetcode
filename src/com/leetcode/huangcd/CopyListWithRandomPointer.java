package com.leetcode.huangcd;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Date: 11/30/13
 * <p/>
 * Time: 1:48 PM
 * <p/>
 * A linked list is given such that each node contains an additional random pointer which could point to any node in
 * the list or null.
 * <p/>
 * Return a deep copy of the list.
 *
 * @author chhuang at live dot cn
 */
public class CopyListWithRandomPointer {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }
        ArrayList<RandomListNode> list = new ArrayList<RandomListNode>();
        HashMap<RandomListNode, Integer> indices = new HashMap<RandomListNode, Integer>();
        RandomListNode pointer = head;
        int index = 0;
        while (pointer != null) {
            list.add(new RandomListNode(pointer.label));
            indices.put(pointer, index);
            index++;
            pointer = pointer.next;
        }
        pointer = head;
        index = 0;
        while (pointer != null) {
            if (pointer.random != null) {
                int randomIndex = indices.get(pointer.random);
                list.get(index).random = list.get(randomIndex);
            }
            index++;
            pointer = pointer.next;
        }
        for (int i = 1; i < list.size(); i++) {
            list.get(i - 1).next = list.get(i);
        }
        return list.get(0);
    }
}
