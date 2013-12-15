package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Date: 12/15/13
 * <p/>
 * Time: 10:40 AM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class CombinationSumTest {

    @Test
    public void testCombinationSum() throws Exception {
        CombinationSum test = new CombinationSum();
        Assert.assertEquals(
                Arrays.asList(Arrays.asList(2, 2, 3), Arrays.asList(7)),
                test.combinationSum(new int[]{2, 3, 6, 7}, 7));
        Assert.assertEquals(
                Arrays.asList(Arrays.asList(7)),
                test.combinationSum(new int[]{7}, 7));
        Assert.assertEquals(
                new ArrayList<ArrayList<Integer>>(),
                test.combinationSum(new int[]{}, 7));
    }
}
