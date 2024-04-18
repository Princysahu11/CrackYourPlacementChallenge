class Solution {
    public String firstPalindrome(String[] words) {
        
        StringBuilder ans = new StringBuilder("");
        
        for(int i=0;i<words.length; i++){
            String str = words[i];
            
            if(isPalindrome(str)){
                ans.append(str);
                break;
            
            }
        }
            
           
            return ans.toString();
            
        
      
    }
    public boolean isPalindrome(String str){
           //String str = words[i];
        int n = str.length();
        
            for(int i =0; i<str.length(); i++){
                if(str.charAt(i) != str.charAt(n-i-1))
                    return false;
            }
        return true;
    }
            
}