class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int first = nums[i]; 
            int second = target - first; 
            if(map.containsKey(second)) {
                return new int[] {i,map.get(second)};
            }

            map.put(nums[i],i); 
        }

        return new int[2];

    }
}

/* Time Complexity: The worst-case time complexity is O(n) here
We create a hash map and store index and values there, and then check if complement for that number exists. */
