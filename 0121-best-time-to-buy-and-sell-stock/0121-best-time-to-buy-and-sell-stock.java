class Solution {
    public int maxProfit(int[] arr) {

        int currmax = arr[0];
        int maxprofit =0;
        for(int i =0; i<arr.length; i++){
            currmax = Math.min(arr[i],currmax);
            int profit = arr[i] - currmax;
            maxprofit = Math.max(profit , maxprofit);

        }
        
        
        
        
        
        
        
        
     return maxprofit;   
        
    }
}