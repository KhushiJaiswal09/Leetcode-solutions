class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length, result = 0;

        for (int i = 1; i < n; i++) {

            if (prices[i - 1] < prices[i])  result = result + prices[i] - prices[i - 1];
            
        }
        return result;
    }
}
