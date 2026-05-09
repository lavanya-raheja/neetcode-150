class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length]; 

        ans[0] = 1; 
        int postfix = 1; 

        for(int i = 1; i < nums.length; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }

        for(int i = nums.length-1; i >= 0; i--) {
            ans[i] *= postfix; 
            postfix *= nums[i]; 
        }
        
        return ans;
    }
}

/* Same linear time complexity as optimal approach, but here, instead of creating 3 arrays, we just create one and calculate the left prefix. Instead of calculating the right prefix, we take a variable postfix which carries the product of all elements it has traversed from the right and multiplies them by the left ones. (Essentially, the right element carries the product of all numbers to right of element and when we multiple it to all numbers on the left of the element, it gives us our answer.*/
