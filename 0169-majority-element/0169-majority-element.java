class Solution {
    public int majorityElement(int[] a) {
        int size = a.length;
         HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<size; i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else{
                map.put(a[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() > size/2){
                return entry.getKey();
            }
        }
        return -1;
    }
}