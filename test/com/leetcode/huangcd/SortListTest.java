package com.leetcode.huangcd;

import com.carrotsearch.junitbenchmarks.BenchmarkRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

/**
 * Date: 11/27/13
 * Time: 3:18 PM
 *
 * @author chhuang at live dot cn
 */
public class SortListTest {
    @Rule
    public TestRule benchmarkRun = new BenchmarkRule();

    @Test
    public void testSortList() throws Exception {
        List<Integer> list = Arrays.asList(2, 3, 1, 2, 4, 5);
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        assertArrayEquals(sortedList.toArray(), ListNode.toList(new SortList().sortList(ListNode.fromList(list))).toArray());
    }

    @Test
    public void testCreation() throws Exception {
        List<Integer> list = Arrays.asList(2, 3, 1, 2, 4, 5);
        assertArrayEquals(list.toArray(), ListNode.toList(ListNode.fromList(list)).toArray());
    }
}
