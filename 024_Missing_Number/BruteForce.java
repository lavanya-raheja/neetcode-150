class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int count = 0; 
        while(count < nums.length) {
            if(!set.contains(count)) {
                return count;
            }

            count++;
        }

        return count;
    }
}

// uses more time and space
