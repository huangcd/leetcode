package com.leetcode.huangcd;

/**
 * Date: 11/28/13
 * <p/>
 * Time: 12:39 PM
 * <p/>
 * <p/>
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p/>
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 *
 * @author chhuang at live dot cn
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int currentMin = Integer.MAX_VALUE;
        int bestProfit = 0;
        for (int price : prices) {
            currentMin = Math.min(price, currentMin);
            bestProfit = Math.max(bestProfit, price - currentMin);
        }
        return bestProfit;
    }
}
