class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix[0][0] > target) {
            return false; 
        }

       int start = 0; 
       int end = (matrix[0].length * matrix.length) - 1;

       while(start <= end) {
            int mid = start + (end-start)/2; // calculate index to search as usual
            int row = mid/matrix[0].length; // division will give row for that index
            int col = mid%matrix[0].length; // remainder will give column in that row for that index
            
            if(matrix[row][col] == target) {
                return true;
            } else if(matrix[row][col] > target) {
                end = mid-1; 
            } else {
                start = mid+1; 
            }
       }

       return false; 
    }
}

/* Time Complexity: O(logn) 
Logic: We treat the 2d array as a flat 1d array and find mid as we normally would. And for that mid, we calculate index and row to find the target. */
