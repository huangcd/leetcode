package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/2/13
 * <p/>
 * Time: 6:43 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class ReorderListTest {

    @Test
    public void testReorderList() throws Exception {
        ReorderList test = new ReorderList();
        ListNode testList;
        testList = ListNode.fromArray(1, 2, 3);
        test.reorderList(testList);
        Assert.assertArrayEquals(new Integer[]{1, 3, 2}, testList.toArray());
        testList = ListNode.fromArray(1, 2, 3, 4);
        test.reorderList(testList);
        Assert.assertArrayEquals(new Integer[]{1, 4, 2, 3}, testList.toArray());
        testList = ListNode.fromArray(1);
        test.reorderList(testList);
        Assert.assertArrayEquals(new Integer[]{1}, testList.toArray());
        testList = ListNode.fromArray(1, 2);
        test.reorderList(testList);
        Assert.assertArrayEquals(new Integer[]{1, 2}, testList.toArray());
        testList = ListNode.fromArray();
        test.reorderList(testList);
        Assert.assertEquals(null, testList);
        testList = null;
        test.reorderList(testList);
    }

    @Test
    public void testReverse() {
        ReorderList test = new ReorderList();
        Assert.assertEquals(null, test.reverse(null));
        Assert.assertArrayEquals(new Integer[]{1,2,3,4}, test.reverse(ListNode.fromArray(4,3,2,1)).toArray());
        Assert.assertArrayEquals(new Integer[]{1}, test.reverse(ListNode.fromArray(1)).toArray());
    }
}
