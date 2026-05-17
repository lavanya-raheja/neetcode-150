class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        int slow = sumOfSquares(n); 
        int fast = sumOfSquares(sumOfSquares(n)); 

        while(slow != fast) {
            slow = sumOfSquares(slow); 
            fast = sumOfSquares(sumOfSquares(fast)); 

            System.out.println(slow + "..." + fast); 
            
            if(slow == 1 || fast == 1) return true; 
        }

        if(slow == 1 || fast == 1) return true; 
        return false; 
    }

    public int sumOfSquares(int num) {
        int sum = 0; 

        while(num > 0) {
            int digit = num%10;
            sum += (digit * digit); 
            num /= 10; 
        }

        return sum; 
    }
}

// Time Complexity: O(Logn)
// Logic: The premise is that if the sum is not 1 eventually, it will be an endless loop. We calculate the sum of squares of the digits every time, and if it is 1, we return true/ If it is not 1, we check if the loop is a cycle using cycle detection method.
