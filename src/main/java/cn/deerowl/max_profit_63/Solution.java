package cn.deerowl.max_profit_63;

public class Solution {

    public int maxProfit(int[] prices) {
        if (prices==null || prices.length<=1) return 0;
        int minPrice = prices[0];
        int result = 0;
        for (int i = 1 ; i<prices.length ; i++) {
            if (prices[i] > minPrice) {
                result = Math.max(result, prices[i] - minPrice);
            } else {
                minPrice = prices[i];
            }
        }
        return result;
     }
}
