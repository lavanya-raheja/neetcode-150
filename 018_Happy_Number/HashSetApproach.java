class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum = 0; 

        while(n > 0) {
            while(n > 0) {
                int digit = n%10; 
                sum += digit*digit; 
                n /= 10; 
            } // calculate sum of squares of the number

            if(sum == 1) return true; 
            if(set.contains(sum)) return false; // check if cycle exists
            set.add(sum); 
            n = sum; // update number
            sum = 0; // reset sum
        }

        return false; 
    }
}

// Time Complexity: O(logn)
