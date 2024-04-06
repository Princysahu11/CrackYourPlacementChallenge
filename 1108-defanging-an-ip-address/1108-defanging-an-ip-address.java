class Solution {
    public String defangIPaddr(String address) {
        
        int n = address.length();
        StringBuilder sb = new StringBuilder("");
        
        for(int i =0; i<n; i++){
            char ch = address.charAt(i);
            
            
            if(ch == '.')
                sb.append("[.]");
            else 
                sb.append(ch);
            
                

        }
        return sb.toString();
    }
}