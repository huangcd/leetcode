package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/13/13
 * <p/>
 * Time: 1:23 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class JumpGameTest {
    private final static String TAG = JumpGameTest.class.getName();

    @Test
    public void testCanJump() throws Exception {
        JumpGame test = new JumpGame();
        Assert.assertEquals(true, test.canJump(new int[]{2, 3, 1, 1, 4}));
        Assert.assertEquals(false, test.canJump(new int[]{3, 2, 1, 0, 4}));
        Assert.assertEquals(false, test.canJump(new int[]{2, 0}));
        Assert.assertEquals(false, test.canJump(new int[]{-2, 0}));
    }
}
