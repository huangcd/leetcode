package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/6/13
 * <p/>
 * Time: 4:53 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class InsertionSortListTest {

    @Test
    public void testInsertionSortList() throws Exception {
        InsertionSortList test = new InsertionSortList();
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6}, test.insertionSortList(ListNode.fromArray(6, 5, 4, 3, 2, 1)).toArray());
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6}, test.insertionSortList(ListNode.fromArray(6, 3, 4, 5, 2, 1)).toArray());
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6}, test.insertionSortList(ListNode.fromArray(1, 2, 3, 4, 5, 6)).toArray());
        Assert.assertArrayEquals(new Integer[]{1}, test.insertionSortList(ListNode.fromArray(1)).toArray());
        Assert.assertEquals(null, test.insertionSortList(null));
    }
}
