class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i=i+2) {
            if(nums[i] != nums[i+1]) {
                return nums[i];
            }
        }

        return nums[nums.length-1];
    }
}

/* Time Complexity: O(nlogn) 
This is based on the assumption that every number must have a pair. We sort the arrays, which will put two identical numbers together, and we need only for each element to compare itself to its neighbor and move forward.
If the loop ends without the element, that means the odd element is the last one. Or if there's an array with length 1, the odd element is the only one. For these cases, we return nums[last] if no other element is found in the array. */
