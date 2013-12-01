package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/1/13
 * <p/>
 * Time: 2:00 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class SwapNodesInPairsTest {

    @Test
    public void testSwapPairs() throws Exception {
        SwapNodesInPairs test = new SwapNodesInPairs();
        Assert.assertArrayEquals(new Integer[]{2, 1, 4, 3}, test.swapPairs(ListNode.fromArray(1, 2, 3, 4)).toArray());
        Assert.assertArrayEquals(new Integer[]{2, 1, 3}, test.swapPairs(ListNode.fromArray(1, 2, 3)).toArray());
    }
}
