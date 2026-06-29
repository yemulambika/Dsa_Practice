// Last updated: 6/29/2026, 11:09:45 AM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int MaxProfit = 0 ; int minValue = prices[0];
4        for(int i = 1; i < prices.length ; i++){
5            MaxProfit = Math.max(prices[i] - minValue , MaxProfit);
6            minValue = Math.min(minValue ,prices[i]);
7        }
8        return MaxProfit;
9    }
10}