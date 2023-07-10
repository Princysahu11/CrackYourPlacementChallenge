class Solution {
    public String reverseWords(String s) {
        
        Stack<String> st = new Stack<>();
        String temp ="";
        String res  = "";
       
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                
                if(temp.length()> 0)
                   st.push(temp);
                
                temp="";
            }
            else {
                temp =temp + s.charAt(i);
            }

        }
        res = res + temp;
        
        while(!st.isEmpty()){
            res = res + " " + st.pop();
        }
        if(res.length() != 0 && res.charAt(0)==' ')
            res = res.substring(1);
        
        return res;
        
    }
}