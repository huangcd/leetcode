package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Date: 12/16/13
 * <p/>
 * Time: 2:21 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class PascalsTriangleIITest {

    @Test
    public void testGetRow() throws Exception {
        PascalsTriangleII test = new PascalsTriangleII();
        Assert.assertEquals(Arrays.asList(1, 3, 3, 1), test.getRow(3));
    }
}
