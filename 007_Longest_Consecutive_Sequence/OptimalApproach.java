class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 1) {
            return 0;
        }

        int count = 0;
        int max = 1; 

        Set<Integer> set = new HashSet<>(); 

        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for(int num : set) {
            if(set.contains(num-1)) {
                continue; // element lies in middle of sequence and should be skipped for now
            } else {
                count++; 
                int next = num + 1;
                // now increment until sequence continues
                while(set.contains(next)) {
                    count++;
                    next++; 
                }

                // sequence has broken so we update max value if needed and restart counting
                max = Math.max(max,count); 
                count = 0; 
            }
        }

        return max; 
    }
}

/* Time Complexity O(n)
The logic is simple. We add the whole array to a hash set, and then we just loop over the set to find the start of each sequence. We count how long that sequence goes using a count variable, and when it breaks, we update the max variable if needed and move on to the next sequence.*/
