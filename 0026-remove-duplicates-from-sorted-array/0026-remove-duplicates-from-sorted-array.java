class Solution {
    public int removeDuplicates(int[] nums) {
    LinkedHashSet<Integer> hs = new LinkedHashSet<>();

        for(int i=0; i<nums.length; i++){
            hs.add(nums[i]);
        }
        
        int i=0;
        for(int k : hs){
            
            nums[i++] = k;
           
        }
       return hs.size();
        
       
       
    }
}