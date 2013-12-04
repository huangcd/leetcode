package com.leetcode.huangcd;

/**
 * Date: 12/4/13
 * <p/>
 * Time: 9:59 AM
 * <p/>
 *
 * @author chhuang at live dot cn
 */
public class SortColors {
    public void sortColors(int[] A) {
        int size = A.length;
        int redIndex = 0;
        int blueIndex = size - 1;
        while (redIndex < size && A[redIndex] == 0) {
            redIndex++;
        }
        while (blueIndex >= 0 && A[blueIndex] == 2) {
            blueIndex--;
        }
        for (int i = redIndex; i <= blueIndex; ) {
            if (A[i] == 0) {
                A[i] = A[redIndex];
                A[redIndex] = 0;
                redIndex++;
                i++;
            } else if (A[i] == 1) {
                i++;
            } else if (A[i] == 2) {
                A[i] = A[blueIndex];
                A[blueIndex] = 2;
                blueIndex--;
            }
        }
    }
}
