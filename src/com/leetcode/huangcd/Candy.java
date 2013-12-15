package com.leetcode.huangcd;

/**
 * Date: 12/15/13
 * <p/>
 * Time: 5:41 PM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class Candy {
    public int candy(int[] ratings) {
        int length = ratings.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return 1;
        }
        int[] candies = new int[length];
        int i = 0;
        while (i < length) {
            // local min
            if ((i == 0 || ratings[i] <= ratings[i - 1]) && (i == length - 1 || ratings[i] <= ratings[i + 1])) {
                candies[i] = 1;
                // expand
                int back = i - 1;
                while (back == 0 || back >= 1 && ratings[back] < ratings[back - 1]) {
                    if (ratings[back] == ratings[back + 1]) {
                        candies[back] = candies[back + 1];
                    } else {
                        candies[back] = candies[back + 1] + 1;
                    }
                    back--;
                }
                int forward = i + 1;
                while (forward == length - 1 || forward <= length - 2 && ratings[forward] < ratings[forward + 1]) {
                    if (ratings[forward] == ratings[forward - 1]) {
                        candies[forward] = candies[forward - 1];
                    } else {
                        candies[forward] = candies[forward - 1] + 1;
                    }
                    forward++;
                }
                i = forward;
            }
            i++;
        }
        if (candies[0] == 0) {
            candies[0] = candies[1] + (ratings[0] == ratings[1] ? 0 : 1);
        }
        if (candies[length - 1] == 0) {
            candies[length - 1] = candies[length - 2] + (ratings[length - 1] == ratings[length - 2] ? 0 : 1);
        }
        for (i = 1; i < length - 1; i++) {
            if (candies[i] == 0) {
                if (candies[i + 1] == 0) {
                    int leftMax = candies[i - 1] + (ratings[i] == ratings[i - 1] ? 0 : 1);
                    int rightMax = candies[i + 2] + (ratings[i + 2] == ratings[i + 1] ? 0 : 1);
                    candies[i] = candies[i + 1] = Math.max(leftMax, rightMax);
                } else {
                    int leftMax = candies[i - 1] + (ratings[i] == ratings[i - 1] ? 0 : 1);
                    int rightMax = candies[i + 1] + (ratings[i] == ratings[i + 1] ? 0 : 1);
                    candies[i] = Math.max(leftMax, rightMax);
                }
            }
        }
        int sum = 0;
        for (i = 0; i < length; i++) {
            sum += candies[i];
        }
        return sum;
    }
}
