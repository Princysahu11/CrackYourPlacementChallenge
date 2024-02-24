class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
//         int row =0;
//         int col = matrix[0].length-1;

//         while(row<matrix.length && col>=0){

//             if(matrix[row][col] == target)
//             return true;

//             else if(matrix[row][col] < target)
//             row++;

//             else 
//             col--;
//         }


// return false;
        
        int n = matrix.length;
        int m = matrix[0].length;
        int low =0;
        int hig = (n*m)-1;
        
        while(low <= hig){
            int mid =( low + (hig-low)/2);
            
            if(matrix[mid/m][mid%m] == target)
                return true;
            else if(matrix[mid/m][mid%m] < target)
                low = mid +1;
            else 
                hig = mid -1;

        }
        return false;
        
        
}
}