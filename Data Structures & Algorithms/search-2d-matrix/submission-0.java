class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length , n = matrix[0].length;
        int row = getRow(matrix, target);
        if(row == -1) return false;

        int s = 0, e = n-1;
        while(s <= e) {
            int mid = s + ((e - s) / 2);  
            if(target == matrix[row][mid]) 
                return true;
            else if(target > matrix[row][mid]) s = mid+1;
            else e = mid-1;
        }
        return false;

    }

    private int getRow(int[][] matrix, int target) {
        int m = matrix.length , n = matrix[0].length;
        int s = 0, e = m - 1, getRow = 0;
        while(s <= e) {
            int mid = s + ((e - s) / 2);  
            if(target >= matrix[mid][0] && target <= matrix[mid][n-1]) 
                return mid;
            
            else if(target >= matrix[mid][0]) s = mid + 1; 
            else e = mid - 1;
        }   
        return -1;
    }
}
