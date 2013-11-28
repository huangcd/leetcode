package com.leetcode.huangcd;

/**
 * Date: 11/28/13
 * <p/>
 * Time: 12:39 PM
 * <p/>
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p/>
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like
 * (ie, buy one and sell one share of the stock multiple times).
 * However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 *
 * @author chhuang at live dot cn
 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int bestProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - prices[i - 1];
            if (profit > 0) {
                bestProfit += profit;
            }
        }
        return bestProfit;
    }
}
