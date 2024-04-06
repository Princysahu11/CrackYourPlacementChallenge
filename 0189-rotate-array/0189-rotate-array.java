class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int n = nums.length;
        reverseArr(nums,0,n-k-1);
        reverseArr(nums,n-k,n-1);
        reverseArr(nums,0,n-1);
        
        
    }
    static void reverseArr(int [] arr , int s, int end){
        
        while(s<=end){
            int temp = arr[s];
            arr[s] = arr[end];
            arr[end] = temp;
            s++;
            end--;
        }
    }
   
}