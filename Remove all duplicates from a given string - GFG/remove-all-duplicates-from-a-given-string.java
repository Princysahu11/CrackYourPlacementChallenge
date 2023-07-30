//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String str = br.readLine().trim();

            String ans = new Solution().removeDuplicates(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    String removeDuplicates(String str) {
        // code here
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder("");
        
        for(int  i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            set.add(ch);
        }
        for(char ch : set)
        sb.append(ch);
        
        return sb.toString();
    }
}

