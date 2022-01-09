class Solution {
    public int maxProfit(int[] prices) {
         int MinSoFar = prices[0];
        int maxProfit = 0;
        for (int currentPrice : prices) {
            MinSoFar = Math.min(MinSoFar, currentPrice);
            maxProfit = Math.max(maxProfit, currentPrice - MinSoFar);
        }
        return maxProfit;
    }
}