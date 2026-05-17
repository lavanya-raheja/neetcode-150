class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int bp = prices[0]; 

        for(int i = 0; i < prices.length; i++) {
            bp = Math.min(bp, prices[i]);
            max = Math.max(max, prices[i]-bp);
        }

        return max;
    }
}

// Time Complexity: O(n)
// Logic: For buying the stocks, the best buying price would be the lowest value, so we simply check for that. If at the lowest value, the selling price on that day returns the best profit, update the profit. If not, we simply check the value against other days.
