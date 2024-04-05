class Solution {
    public String longestCommonPrefix(String[] strs) {
        
       Arrays.sort(strs);
    ArrayList<Character> list = new ArrayList<>();
        int n =strs.length;
        String s1 = strs[0];
        String s2 = strs[n-1];
        
        int minlen = Math.min(s1.length(),s2.length());
        
        // if(s1.charAt(0) == s2.charAt(0)){
            
            for(int i =0; i<minlen; i++){
                
                if(s1.charAt(i) == s2.charAt(i))
                    list.add(s1.charAt(i));
                else 
                    break;

            }

        
       
            System.out.print(" ");
            
            StringBuilder sb = new StringBuilder("");
            for(char ch : list){
                sb.append(ch);

            }
        return sb.toString();
        
        
        
    }
}