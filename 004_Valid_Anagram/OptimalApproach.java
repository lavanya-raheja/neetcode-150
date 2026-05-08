class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false; 
        }

        Map<Character, Integer> map = new HashMap<>(); 

        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0) - 1);
        }

        for(int count: map.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true; 
    }
}

/* Time Complexity: O(n) 
This solution takes a map and uses it to count frequency of each character. We enter characters from string 1 to map and take out characters from string 2. If it is a valid anagram, at the end, the hashmap should be completely empty.*/
