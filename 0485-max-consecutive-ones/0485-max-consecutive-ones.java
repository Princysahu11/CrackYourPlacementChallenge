class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max_num = 0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
                max_num = Math.max(max_num,count);
            }
            else if (nums[i] == 0)
                count =0;
                

        }
        return max_num;
        
    }
}