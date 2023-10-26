class Solution {
    public boolean isAnagram(String str1, String str2) {
        
      char [] c1 = str1.toCharArray();
        char [] c2 = str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (c1.length != c2.length)
            return false;
        for(int i =0; i<c1.length; i++){
            if (c1[i] != c2[i])
                return false;
        }
        return true;
    }
}
    
