class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); 

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if(!stack.isEmpty() && ((s.charAt(i) == ')' && stack.peek() == '(') || (s.charAt(i) == ']' && stack.peek() == '[') || (s.charAt(i) == '}' && stack.peek() == '{'))) {
                stack.pop(); 
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}

/* Time Complexity: O(n) 
Logic: Add opening brackets and pop them out if their closing pair is found. For it to have perfect parentheses pairs, at every closing bracket, the corresponding opening bracket should be the topmost in the stack. In the end, if the stack is not empty, then it has unclosed parentheses and is not valid. */
