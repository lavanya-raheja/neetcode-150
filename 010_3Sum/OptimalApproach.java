class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int left = 0; 
        int right = nums.length-1;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length-2; i++) {
            if(nums[i] > 0) {
                break; // if starting number (hence smallest) is positive, the addition can never be 0
            } else if(i > 0 && nums[i] == nums[i-1]) {
                continue; // skip iteration if same number is repeated
            }

            left = i+1;
            right = nums.length-1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > 0) {
                    right--;
                } else if(sum < 0) {
                    left++;
                } else if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++; 
                    right--;
                    while (left < right && nums[left] == nums[left-1]) left++; // if left is same after increment
                    while (right > left && nums[right] == nums[right+1]) right--; // if right is same after increment 
                }
            }
        }

        return result;
    }
}

/* Time Complexity: O(n**2)
Logic: We sort the array and use a two-pointer approach. We fix a number, and then use a two-pointer approach to find other numbers which, upon adding, will give 0*/
