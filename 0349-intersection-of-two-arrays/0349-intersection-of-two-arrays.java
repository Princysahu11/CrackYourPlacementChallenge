class Solution {
    public int[] intersection(int[] a, int[] b) {
        
         HashSet<Integer> set = new HashSet<>();
         HashSet<Integer> intersect = new HashSet<>();
        
        for (int i =0; i<a.length; i++) {
            set.add(a[i]);
        }

        for (int i =0; i<b.length; i++){
            if (set.contains(b[i])) {
                intersect.add(b[i]);
            }
            
    }
        int [] res = new int[intersect.size()];
        int i =0;
        for(int x: intersect)
            res[i++] = x;
    
       
        return res;
    }
}