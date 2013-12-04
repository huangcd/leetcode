package com.leetcode.huangcd;

import com.carrotsearch.junitbenchmarks.BenchmarkRule;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

/**
 * Date: 12/4/13
 * <p/>
 * Time: 2:06 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class CombinationsTest {
    @Rule
    public org.junit.rules.TestRule benchmarkRun = new BenchmarkRule();

    @Test
    public void testCombine() throws Exception {
        Combinations test = new Combinations();
        Assert.assertEquals("[[1, 2], [1, 3], [2, 3]]", test.combine(3, 2).toString());
        Assert.assertEquals("[[1]]", test.combine(1, 1).toString());
        Assert.assertEquals("[]", test.combine(1, 0).toString());
        test.combine(100, 3);
    }
}
