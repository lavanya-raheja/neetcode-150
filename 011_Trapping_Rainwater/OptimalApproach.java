class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1; 

        int tw = 0; // total trapped water

        int leftMax = height[0];
        int rightMax = height[right];

        while(left < right) {
            if(leftMax < rightMax) {
                left++; 
                leftMax = Math.max(leftMax, height[left]);
                tw += leftMax - height[left];
            } else {
                right--; 
                rightMax = Math.max(rightMax, height[right]);
                tw += rightMax - height[right];
            }
        }

        return tw;
    }
}

/* Time Complexity: O(n)
Logic: In this problem, we essentially take two elements, left and right, that will track which element we are calculating trapped rainwater for. And we will take leftMax and rightMax to keep track of boundaries for left and right elements, respectively. Since the highest water level that a bar can reach is determined by the lower boundary, we store only the lower boundary for each bar for checking. We compare leftMax and rightMax, and whichever is the lower boundary, we increment that element, and if that element is greater, we update the lower boundary. If it is the same or less, we calculate water trapped by subtracting bar height from the lower boundary. Then we again compare leftMax and rightMax, and move to the next element accordingly until left == right and all the elements have been traversed.*/
