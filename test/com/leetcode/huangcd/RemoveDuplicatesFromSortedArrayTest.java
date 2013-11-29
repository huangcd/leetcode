package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 11/29/13
 * <p/>
 * Time: 11:11 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void testRemoveDuplicates() throws Exception {
        RemoveDuplicatesFromSortedArray test = new RemoveDuplicatesFromSortedArray();
        Assert.assertEquals(1, test.removeDuplicates(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        Assert.assertEquals(2, test.removeDuplicates(new int[]{1, 2, 2, 2, 2, 2, 2, 2}));
        Assert.assertEquals(2, test.removeDuplicates(new int[]{1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}));
    }
}
