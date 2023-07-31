class Solution {
    public int singleNumber(int[] arr) {
        int n = arr.length;
    HashMap<Integer,Integer> map = new HashMap<>();
    
    for(int i =0; i<arr.length; i++){
        
        if(map.containsKey(arr[i]))
            map.put(arr[i],map.get(arr[i])+1);
        
        else 
            map.put(arr[i],1);
        

    }
        
    int num =0;
        
    
    for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        if(entry.getValue() == 1)
            num = num+entry.getKey();
          
    }
        return num;
    
      
    }
        
}