class Solution {
    public int mostWordsFound(String[] arr) {
        
        int ans =0;
        int n = arr.length;
        int count =0;
        
        for(int i =0; i<n; i++){
            int wordlen = arr[i].split(" ").length;
            ans = Math.max(ans,wordlen);
            
        }
        return ans;
        
        
        
    }
}