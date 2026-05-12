class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix[0].length == 1 && matrix.length == 1) {
            return matrix[0][0] == target;
        }
        int row = 0;
        for(int i = 0; i < matrix.length; i++) {
            if(matrix.length == 1) {
                row = 0; 
                break; 
            }

            if(matrix[i][matrix[i].length-1] >= target && target >= matrix[i][0]) {
                row = i;
                break;
            }
        }

        int start = 0; 
        int end = matrix[].length-1;
        int mid = 0;

        while(start <= end) {
            mid = start + (end-start)/2;
            if(matrix[row][mid] > target) {
                end = mid-1;
            } else if(matrix[row][mid] < target) {
                start = mid+1;
            } else if(matrix[row][mid] == target) {
                return true; 
            } 
        }

        return false; 
    }
}

/* Time Complexity: O(m * n)
Logic: We first search which row the target would fall in if it exists and then simply iterate over that row to find a solution. 
*/
