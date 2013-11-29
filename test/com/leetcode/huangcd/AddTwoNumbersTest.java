package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 11/29/13
 * <p/>
 * Time: 10:45 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class AddTwoNumbersTest {

    @Test
    public void testAddTwoNumbers() throws Exception {
        AddTwoNumbers test = new AddTwoNumbers();
        Assert.assertArrayEquals(
                new Integer[]{7, 0, 8},
                ListNode.toList(
                        test.addTwoNumbers(
                                ListNode.fromArray(2, 4, 3),
                                ListNode.fromArray(5, 6, 4)
                        )
                ).toArray());
        Assert.assertArrayEquals(
                new Integer[]{2, 4, 3},
                ListNode.toList(
                        test.addTwoNumbers(
                                ListNode.fromArray(2, 4, 3),
                                null
                        )
                ).toArray());
        Assert.assertArrayEquals(
                new Integer[]{2, 4, 3},
                ListNode.toList(
                        test.addTwoNumbers(
                                null,
                                ListNode.fromArray(2, 4, 3)
                        )
                ).toArray());
        Assert.assertArrayEquals(
                new Integer[]{0, 1},
                ListNode.toList(
                        test.addTwoNumbers(
                                ListNode.fromArray(2),
                                ListNode.fromArray(8)
                        )
                ).toArray());
        Assert.assertArrayEquals(
                new Integer[]{0, 0, 1},
                ListNode.toList(
                        test.addTwoNumbers(
                                ListNode.fromArray(2, 9),
                                ListNode.fromArray(8)
                        )
                ).toArray());
    }
}
