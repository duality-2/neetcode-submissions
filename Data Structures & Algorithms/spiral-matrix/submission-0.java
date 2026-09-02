class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        List<Integer> list = new ArrayList<>();

        int left = 0, right = m - 1, top = 0, bottom = n - 1;
        while(top <= bottom && left <= right) {
            for(int i = left; i <= right; i++) 
                list.add(matrix[top][i]);
            top++;

            for(int i = top; i <= bottom; i++) 
                list.add(matrix[i][right]);
            right--;

            if(top <= bottom) {     // before going left
                for(int i = right; i >= left; i--) 
                    list.add(matrix[bottom][i]);
                bottom--;
            }

            if(left <= right) {     // before going up
                for(int i = bottom; i >= top; i--) 
                    list.add(matrix[i][left]);
                left++;
            }
        }
        return list;
    }
}

