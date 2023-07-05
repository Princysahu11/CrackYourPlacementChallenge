class Solution {
    public boolean validPalindrome(String str) {
       
        int n = str.length();
         int s =0;
        int end = n-1;
        
        
       while(s<end){
           if(str.charAt(s) == str.charAt(end)){
               s++;
               end--;
              
           }
           else {

               return (isPalindrome(str,s+1,end) || (isPalindrome(str,s,end-1)));
           }

           
       
       }
        return true;
    }
    
    boolean isPalindrome(String str,int s , int end){
       while(s<end){
           if(str.charAt(s) == str.charAt(end)){
               s++;
               end--;
           }
           else {
               return false;
           }
       }
        return true;
    }
    }
