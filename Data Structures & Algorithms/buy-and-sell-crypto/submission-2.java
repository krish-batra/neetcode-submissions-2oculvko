class Solution {
    public int maxProfit(int[] prices) {
        int maxPrice = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                int current = prices[j] - prices[i];
                maxPrice = Math.max(maxPrice, current);
                if(maxPrice < 0){
                    return 0;
                }
            }
        }
        return maxPrice;
    }
}
