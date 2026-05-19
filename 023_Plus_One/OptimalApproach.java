class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++; 
                return digits; // everything ends if even one digit is less than 9 as it can then be incremented and returned back
            } else {
                digits[i] = 0; 
            }
        } // since the loop would end the moment any other digit appeared, if it ends without returning, that means all the digits so far were 9s. 

        int[] ans = new int[digits.length+1]; 
        ans[0] = 1;
        return ans;
    }
}

// Time Complexity: O(n)
