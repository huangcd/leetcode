package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 11/29/13
 * <p/>
 * Time: 11:23 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class RemoveElementTest {

    @Test
    public void testRemoveElement() throws Exception {
        RemoveElement test = new RemoveElement();
        Assert.assertEquals(0, test.removeElement(new int[0], 1));
        Assert.assertEquals(0, test.removeElement(new int[]{1}, 1));
        Assert.assertEquals(2, test.removeElement(new int[]{1, 2, 1, 2, 1}, 1));
        Assert.assertEquals(2, test.removeElement(new int[]{1, 1, 1, 2, 1, 2, 1}, 1));

    }
}
