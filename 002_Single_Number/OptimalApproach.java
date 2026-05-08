class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }

        return result; 
    }
}

/* Time Complexity: O(n) 
We use XOR operator which cancels out identical numbers so the odd number is the last one standing. */
