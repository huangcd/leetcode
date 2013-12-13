package com.leetcode.huangcd;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Date: 12/4/13
 * <p/>
 * Time: 9:55 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class WordLadderTest {

    @Test
    public void testLadderLength() throws Exception {
        WordLadder test = new WordLadder();
        Assert.assertEquals(5, test.ladderLength("hit", "cog", new HashSet<String>(Arrays.asList("hot", "dot", "dog", "lot", "log"))));
    }
}
