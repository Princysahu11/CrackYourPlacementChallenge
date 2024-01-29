class Solution {
    public boolean checkIfPangram(String str) {
//         boolean flag = false;
//         for (char ch='a' ; ch<='z'; ch++){
//             boolean panagram = check_panagram(ch,str);
//             if(panagram == false){
//                 flag = false;
//                 break;

//             }
//             else
//                 flag = true;
//         }
//         return flag;
//     }
//     public boolean check_panagram(char ch ,String str){
//         for(char c: str.toCharArray()){
//             if(c == ch)
//                 return true;
            
//         }
//             return false;
        
//     }
        
        HashSet<Character> set = new HashSet<>();
        String str1 = str.toLowerCase();
        if(str.length() < 26)
            return false;
        for(int i=0; i<str1.length(); i++){
            set.add(str1.charAt(i));
        }
        String temp = "abcdefghijklmnopqrstuvwxyz";
        for(int i =0; i<temp.length(); i++){
            if(!set.contains(temp.charAt(i)))
                return false;
        }
        return true;
    }
}