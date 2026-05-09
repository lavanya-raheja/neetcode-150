class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, List<String>> map = new HashMap<>(); 
        List<List<String>> list = new ArrayList<>();

        for(int i = 0; i <strs.length; i++) {
            char[] arr = strs[i].toCharArray(); 
            Arrays.sort(arr);
            String str = new String(arr);
            if(!map.containsKey(str)) {
                List<String> l = new ArrayList<>(); 
                l.add(strs[i]); 
                map.put(str,l);
            } else {
                map.get(str).add(strs[i]); 
            }
        }

       return new ArrayList<>(map.values());
    }
}
