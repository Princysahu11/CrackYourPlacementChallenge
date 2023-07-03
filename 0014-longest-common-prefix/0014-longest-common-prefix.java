class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        Arrays.sort(strs);
        int idx =0;
        String s1 = strs[0];
        String s2 = strs[n-1];
        
       while(idx<s1.length() && idx<s2.length()){

           if(s1.charAt(idx) == s2.charAt(idx)){
               
            idx++;
           }
           else break;
       }
        return s1.substring(0,idx);
    }
}