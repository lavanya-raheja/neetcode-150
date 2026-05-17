class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true; 
        int sum = 0; 

        while(n > 0) {
            while(n > 0) {
                int digit = n%10; 
                sum += digit*digit; 
                n /= 10; 
            }

            if(sum == 1) return true; 
            if(sum == 4) return false; 
            n = sum; 
            sum = 0; 
        }

        return false; 
    }
}

// Logic: Works on the mathematical rule that if there is an endless loop in case of sum of squares, the number 4 will appear in the cycle. We check for the appearance of 4, and if it comes, that means a loop will start and thus the number is not a happy number/ 
