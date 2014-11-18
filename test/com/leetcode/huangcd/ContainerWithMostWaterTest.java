package com.leetcode.huangcd;

import com.carrotsearch.junitbenchmarks.BenchmarkRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

import java.io.FileInputStream;

/**
 * Date: 12/16/13
 * <p/>
 * Time: 1:22 PM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class ContainerWithMostWaterTest {
    @Rule
    public TestRule benchmarkRun = new BenchmarkRule();

    @Test
    public void testMaxArea() throws Exception {
        FileInputStream in = new FileInputStream("ContainerWithMostWater.txt");
        byte[] bytes = new byte[in.available()];
        in.read(bytes);
        String content = new String(bytes);
        String[] items = content.trim().split(",");
        int[] numbers = new int[items.length];
        System.out.println("total number: " + numbers.length);
        for (int i = 0; i < items.length; i++) {
            numbers[i] = Integer.parseInt(items[i]);
        }
        ContainerWithMostWater test = new ContainerWithMostWater();
        test.maxArea(numbers);
    }
}
