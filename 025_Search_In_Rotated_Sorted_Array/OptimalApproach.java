class Solution {
    public int search(int[] nums, int target) {
        int low = 0; 
        int high = nums.length-1; 

        while(low <= high) {
            int mid = low + (high-low)/2; 
            System.out.println(nums[mid]);

            if(nums[mid] == target) { 
                return mid; // if element is found
            } else if(nums[low] <= nums[mid]) { // if left side is correct
                if(nums[low] <= target && nums[mid] >= target) { 
                    high = mid-1; // target is here, go left
                } else {
                    low = mid+1; // target not here, go right
                }
            } else if(nums[high] > nums[mid]) { // if right side is correct
                if(nums[high] >= target && nums[mid] <= target) {
                    low = mid+1;
                } else {
                    high = mid-1; 
                }
            } 
        }

        return -1;
    }
}
