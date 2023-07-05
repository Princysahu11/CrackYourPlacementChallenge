class Solution {
    public int reverse(int x) {
       long sum =0;
        
        while(x != 0){
            int rem = x % 10;
            sum = sum*10 + rem ;
            x = x/10;
        }
        if(sum < Math.pow(-2,31) || sum > Math.pow(2,31))
            return 0;
        
        if(x<0)
            return (int)(-1 * sum);
      
        return (int)sum;
    }
}