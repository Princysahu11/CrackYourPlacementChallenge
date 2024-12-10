class Solution:
    def checkIfExist(self, arr: List[int]) -> bool:
        val_dic = collections.defaultdict(int)
        
        for i in arr:
            val_dic[i]= val_dic[i] +1
        
        
        for num in arr:
            if num != 0 and 2*num in val_dic:
                return True
            
            if num ==0 and val_dic[num] >1:
                return True
            
        return False
        
      
        