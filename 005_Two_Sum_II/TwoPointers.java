class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0; 
        int right = nums.length-1; 

        while(left < right) {
            if(nums[left] + nums[right] > target) {
                right--;
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                return new int[] {left+1,right+1};
            }
        }

        return new int[2];
    }
}

/* Time Complexity: O(n) 
  Logic: Use two pointers to point to last and first digit and then adjust based on their resulting sum. Only works if the array is sorted. */
