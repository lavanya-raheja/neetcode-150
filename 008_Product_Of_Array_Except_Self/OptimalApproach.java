class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length]; 
        int[] ans = new int[nums.length]; 

        left[0] = 1; 
        right[nums.length-1] = 1; 

        for(int i = 1; i < nums.length; i++) {
            left[i] = left[i-1] * nums[i-1]; // calculate prod of every number to left of i
        }
        
        for(int i = nums.length-2; i >= 0; i--) {
            right[i] = right[i+1] * nums[i+1]; // calculate prod of every number to right of i
        }

        for(int i = 0; i < nums.length; i++) {
            ans[i] = left[i]*right[i]; // multiple all numbers to left and right of i
        }

        return ans;
    }
}

