package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/11/13
 * <p/>
 * Time: 7:05 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class EditDistanceTest {

    @Test
    public void testMinDistance() throws Exception {
        EditDistance test = new EditDistance();
        Assert.assertEquals(1, test.minDistance("cat", "hat"));
        Assert.assertEquals(1, test.minDistance("cat", "at"));
        Assert.assertEquals(2, test.minDistance("", "at"));
    }
}
