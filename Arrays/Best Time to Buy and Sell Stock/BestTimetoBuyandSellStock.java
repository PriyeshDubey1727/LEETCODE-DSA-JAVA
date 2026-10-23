class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(minPrice>prices[i]){
                minPrice = prices[i];
            }
            else{
                int profit = prices[i]-minPrice;
                maxProfit = Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }
}
