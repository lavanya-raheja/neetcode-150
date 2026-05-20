class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0; 
        int actual = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += i;
            actual += nums[i];
        }

        sum += nums.length; 
        return sum-actual;
    }
}

// Based on the simple premise that if we know the range of numbers we simply have to calculate actual sum of the range, and subtract the sum of elements in the array from it. The difference will be the missing element.
