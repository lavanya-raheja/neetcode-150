class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < temperatures.length; i++) {
            while(!s.isEmpty() && temperatures[s.peek()] < temperatures[i]) {
                int prev = s.pop();
                ans[prev] = i - prev; 
            }

            s.push(i); 
        }

        while(!s.isEmpty()) {
            temperatures[s.pop()] = 0; 
        }

        ans[temperatures.length-1] = 0; 
        return ans; 
    }
}
