package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Date: 11/27/13
 * Time: 5:50 PM
 *
 * @author chhuang@microsoft.com
 */
public class MergeTwoSortedListsTest {
    private final static String TAG = MergeTwoSortedListsTest.class.getName();

    @Test
    public void testMergeTwoLists() throws Exception {
        Assert.assertArrayEquals(
                new Integer[]{1, 2, 3, 4, 5, 6},
                ListNode.toList(new MergeTwoSortedLists().mergeTwoLists(
                        ListNode.fromArray(1, 3, 5),
                        ListNode.fromArray(2, 4, 6)
                )).toArray());
        Assert.assertArrayEquals(
                new Integer[]{1, 2, 3, 4, 5, 6},
                ListNode.toList(new MergeTwoSortedLists().mergeTwoLists(
                        ListNode.fromArray(1, 2, 3, 4, 5, 6),
                        null
                )).toArray());
        Assert.assertArrayEquals(
                new Integer[]{1, 2, 3, 4, 5, 6},
                ListNode.toList(new MergeTwoSortedLists().mergeTwoLists(
                        null,
                        ListNode.fromArray(1, 2, 3, 4, 5, 6)
                )).toArray());
    }
}
