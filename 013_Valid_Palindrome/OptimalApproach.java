class Solution {
    public boolean isPalindrome(String s) {
        int left = 0; 
        int right = s.length()-1; 

        while(left < right) {
            if(!(Character.isLetter(s.charAt(left)) || Character.isDigit(s.charAt(left)))) {
                left++; 
            } else if(!(Character.isLetter(s.charAt(right)) || Character.isDigit(s.charAt(right)))) {
                right--; 
            } else if(!((s.charAt(left) | ' ') == (s.charAt(right) | ' '))) {
                return false;
            } else {
                left++; 
                right--; 
            }
        }

        return true;
    }
}

/* Time Complexity: O(n)
Logic: If the character is not a letter or a digit, increment the character until it is. And then use left and right pointers to check if it's the same character on both sides.*/
