class Solution {
    public int maxProfit(int[] prices) {
        
        int min = prices[0];
        int profit =0;
        int cost ;
        
        for(int i =1; i<prices.length; i++){
            cost = prices[i] - min;
            profit = Integer.max(profit,cost);
            min = Integer.min(prices[i],min);
            
           
            

        }
        return profit;
        
       
}
}