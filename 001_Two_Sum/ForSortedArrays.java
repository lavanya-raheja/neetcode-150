class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start = 0; 
        int end = nums.length-1; 

        while(start < end) {
            if(nums[start] + nums[end] < target) {
                start++;
            } else if(nums[start] + nums[end] > target) {
                end--; 
            } else {
                return new int[] {start,end};
            }
        }

        return new int[2]; 
    }
}

/* Time Complexity: O(n)
This approach only works if the array is already sorted, or if we need to return actual values, not indices of values. */
