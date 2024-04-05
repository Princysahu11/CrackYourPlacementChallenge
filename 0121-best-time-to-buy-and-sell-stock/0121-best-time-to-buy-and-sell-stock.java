class Solution {
    public int maxProfit(int[] arr) {
        
        int currProfit = arr[0];
        int maxProfit =0;
        for(int i =0; i<arr.length; i++){
            currProfit = Math.min(currProfit,arr[i]);
            int Profit = arr[i] - currProfit;
            maxProfit = Math.max(Profit,maxProfit);
        }
        

        
     return maxProfit;   
        
    }
}