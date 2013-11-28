package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 11/28/13
 * <p/>
 * Time: 9:20 AM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class LinkedListCycleTest {

    @Test
    public void testHasCycle() throws Exception {
        ListNode head = ListNode.fromArray(1, 2, 3, 4, 5, 6, 7, 8);
        Assert.assertFalse(new LinkedListCycle().hasCycle(head));
        head.next.next.next.next.next = head.next.next;
        Assert.assertTrue(new LinkedListCycle().hasCycle(head));
    }
}
