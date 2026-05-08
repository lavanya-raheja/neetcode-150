class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); 
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]) { 
                return true; 
            }
        }

        return false; 
    }
}

/* Time Complexity: O(nlogn) 
There are two approaches here -- nested loops is even more inefficent (O(n**2)) so we use sorting and then each element compares itself to its neighbor. */
