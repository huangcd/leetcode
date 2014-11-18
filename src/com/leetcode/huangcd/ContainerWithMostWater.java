package com.leetcode.huangcd;

/**
 * Date: 12/16/13
 * <p/>
 * Time: 11:11 AM
 * <p/>
 *
 * @author chhuang@microsoft.com
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int length = height.length;
        int maxHeight = 0;
        for (int i = 0; i < length; i++) {
            if (height[i] < maxHeight) {
                continue;
            }
            maxHeight = height[i];
            for (int j = i + 1; j < length; j++) {
                int area = (j - i) * Math.min(height[i], height[j]);
                max = Math.max(max, area);
            }
        }
        return max;
    }
}
