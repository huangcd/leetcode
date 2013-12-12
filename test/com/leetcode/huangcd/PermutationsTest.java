package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

/**
 * Date: 12/6/13
 * <p/>
 * Time: 8:12 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class PermutationsTest {

    @Test
    public void testPermute() throws Exception {
        Permutations test = new Permutations();
        Assert.assertEquals(
                "[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]",
                test.permute(new int[]{1, 2, 3}).toString().replace(" ", ""));
    }
}
