package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/8/13
 * <p/>
 * Time: 7:31 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class MaxPointOnALineTest {

    @Test
    public void testMaxPoints() throws Exception {
        MaxPointOnALine test = new MaxPointOnALine();
        Assert.assertEquals(2, test.maxPoints(new Point[]{new Point(0, 0), new Point(1, 1), new Point(1, -1)}));
    }
}
