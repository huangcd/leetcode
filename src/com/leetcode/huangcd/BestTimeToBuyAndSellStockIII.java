package com.leetcode.huangcd;

/**
 * Date: 11/28/13
 * <p/>
 * Time: 12:39 PM
 * <p/>
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p/>
 * Design an algorithm to find the maximum profit. You may complete at most two transactions.
 * <p/>
 * Note:
 * You may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 *
 * @author chhuang at live dot cn
 */
public class BestTimeToBuyAndSellStockIII {
    public int maxProfit(int[] prices) {
        int size = prices.length;
        int[] bestProfitForward = new int[size];
        int[] bestProfitBackward = new int[size];
        int currentMin = Integer.MAX_VALUE;
        int currentBestProfit = 0;
        for (int i = 0; i < size; i++) {
            int price = prices[i];
            currentMin = Math.min(currentMin, price);
            currentBestProfit = Math.max(currentBestProfit, price - currentMin);
            bestProfitForward[i] = currentBestProfit;
        }
        int currentMax = Integer.MIN_VALUE;
        currentBestProfit = 0;
        for (int i = size - 1; i >= 0; i--) {
            int price = prices[i];
            currentMax = Math.max(currentMax, price);
            currentBestProfit = Math.max(currentBestProfit, currentMax - price);
            bestProfitBackward[i] = currentBestProfit;
        }
        int bestProfit = 0;
        for (int i = 0; i < size; i++) {
            bestProfit = Math.max(bestProfit, bestProfitForward[i] + bestProfitBackward[i]);
        }
        return bestProfit;
    }
}
