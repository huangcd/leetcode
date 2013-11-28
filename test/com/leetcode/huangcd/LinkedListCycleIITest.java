package com.leetcode.huangcd;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Date: 11/28/13
 * <p/>
 * Time: 1:04 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class LinkedListCycleIITest {

    @Test
    public void testDetectCycle() throws Exception {
        int size = 10;
        ListNode[] nodes = new ListNode[size];
        nodes[0] = new ListNode(0);
        for (int i = 1; i < size; i++) {
            nodes[i] = new ListNode(i);
            nodes[i - 1].next = nodes[i];
        }
        LinkedListCycleII test = new LinkedListCycleII();
        Assert.assertNull(test.detectCycle(nodes[0]));
        for (int i = 0; i < size; i++) {
            nodes[size - 1].next = nodes[i];
            Assert.assertEquals(nodes[i], test.detectCycle(nodes[0]));
        }
    }
}
