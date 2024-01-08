class Solution {
    public int maxProfit(int[] prices) {
        int currmax = prices[0];
        int maxProfit = 0;
        for(int i =0; i<prices.length; i++){
            currmax = Math.min(prices[i],currmax);
            int profit = prices[i]-currmax;
            maxProfit = Math.max(profit,maxProfit);

        }
        
        return maxProfit;
        
       
}
}