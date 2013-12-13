package com.leetcode.huangcd;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * Date: 12/6/13
 * <p/>
 * Time: 9:31 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class ReverseLinkedListIITest {

    @Test
    public void testReverseBetween() throws Exception {
        ReverseLinkedListII test = new ReverseLinkedListII();
        assertEquals("[1,4,3,2,5]",
                Arrays.toString(test.reverseBetween(ListNode.fromArray(1, 2, 3, 4, 5), 2, 4).toArray())
                      .replace(" ", ""));
        assertEquals("[1,5,4,3,2]",
                Arrays.toString(test.reverseBetween(ListNode.fromArray(1, 2, 3, 4, 5), 2, 5).toArray())
                        .replace(" ", ""));
    }
}
