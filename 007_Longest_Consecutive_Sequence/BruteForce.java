class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 1) {
            return 0;
        }

        Arrays.sort(nums);
        int count = 1; // keep track of current sequence length
        int max = 1; // keep track of longest sequence length

        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i+1] == nums[i] + 1) {
                count++; 
            } else if(nums[i+1] == nums[i]) {
                continue; 
            } else { 
                if(max < count) {
                    max = count; // sequence breaks here so we update max
                }
                count = 1; // sequence restarts after breaking
            }
        }

        if(max < count) { // relevant check if the maximum sequence never broke or there was only one sequence
            max = count;
        }

        return max;
    }
}

/* Time Complexity: O(nlogn) 
Logic: The logic is simple: we use a count variable to keep track of the current count of the sequence, and we use a max variable to keep track of the maximum count until now. We sort the array, check its neighbors to see if they maintain the sequence, skip duplicate digits, and if the sequence breaks, we reset the count to 1. Then, if the count exceeds max, we update max and move on. */
