//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String str)
    {
        // code here 
        Stack<String> st = new Stack<>();
        String temp ="";
        String res = "";
        
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(ch == '.'){
                if(temp.length() > 0)
                st.push(temp);
                
                temp = "";
            }
            else {
                temp = temp + ch;
            }
            
        }
        res = res + temp;
        while(!st.isEmpty()){
            res = res + "." + st.pop();
            
            // if(res.length() != 0 && res.charAt(0) == '.')
            // res = res.substring(1);
        }
        return res;
    }
}