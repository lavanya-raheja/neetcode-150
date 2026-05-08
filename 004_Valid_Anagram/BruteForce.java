class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) { 
            return false; 
        }

        char[] ss = s.toCharArray(); 
        char[] tt = t.toCharArray();

        Arrays.sort(ss); 
        Arrays.sort(tt); 
        
        return Arrays.equals(ss,tt); 
    }
}

/* Time Complexity: O(nlogn)
We basically just convert both strings to arrays and sort and compare them. If they are anagrams, they should be equal. */
