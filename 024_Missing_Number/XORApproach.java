class Solution {
    public int missingNumber(int[] nums) {
        int step = nums.length; 
        for(int i = 0; i < nums.length; i++) {
            step ^= nums[i] ^ i;
        }

        return step;
    }
}

// In XOR each number cancels itself out so we simply XOR i with nums[i] and the last number of the range (defined by step)
