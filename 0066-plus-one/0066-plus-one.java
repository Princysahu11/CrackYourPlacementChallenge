class Solution {
    public int[] plusOne(int[] arr) {
        
        for(int i = arr.length-1; i>=0; i--){
            //agar humara arr[i] is less than 9 hai 
            // then we have to just increased the last value by 1
            if(arr[i] < 9){
                arr[i]++;
                return arr;
            }
            // if arr[i] = 9 then by plus one it becomes 10 so 
            // we just add 0 in arr[i]
            arr[i] =0;
        }
        // this cases is use to handle like if we have 9,9,9 
        // by doing plus one number is become 1 0 0 0 so just we have to 
        // add 1 in arr[0]
        arr = new int [arr.length+1];
        arr[0] =1;
        
        return arr;
        
        
        
    }
}