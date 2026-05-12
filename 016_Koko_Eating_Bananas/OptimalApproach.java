class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1; 
        int end = 1; 
        int mid = 0;
        for(int i = 0; i < piles.length; i++) {
            end = Math.max(end, piles[i]); 
        }

        int ans = 0;

        while(start <= end) {
            mid = start + (end-start)/2; // speed koko takes per hour 
            long hours = 0; 
            for(int i = 0; i < piles.length; i++) {
                if(piles[i] > mid) {
                    hours += piles[i]/mid; 
                    if(piles[i]%mid != 0) hours++;
                } else {
                    hours++; 
                }
            }

            if(hours <= h) { // if hours are less than koko has we assign that and look for a smaller solution if exisst
                ans = mid; 
                end = mid-1; 
            } else {
                start = mid+1;
            }

        }

        return ans; 
    }
}

// Time Complexity: O(n . logm) 
// Logic: We calculate the speed as the midpoint, then iterate over the array to see how many hours Koko will take at that speed. If hours are more than koko has, we move the start to m+1 to increase mid and hence speed. Otherwise, if hours are equal or less than total hours, we assign that speed to the current answer and move the end to mid-1 to look for a smaller solution if it exists.
