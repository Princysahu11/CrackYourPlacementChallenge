class Solution {
    public boolean isValid(String str) {
       
        Stack<Character> st = new Stack<>();
        
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            
            else {
                
                if(st.isEmpty())
                return false;
            
                    else if(! (isMatching(st.peek() ,ch ) ) )
                        return false;
                       
                    else {
                        st.pop();
                }
            }
            }
        
        return st.isEmpty();
    }
    
    


    boolean isMatching(char a , char b){
        
return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b ==']');
            
            
    }
   


}
