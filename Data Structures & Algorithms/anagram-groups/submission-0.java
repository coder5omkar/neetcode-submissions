class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            // Count frequencies of lowercase letters 'a' through 'z'
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            
            // Build a unique string identifier from the frequency array
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append('#'); // Delimiter to prevent collisions
                sb.append(count[i]);
            }
            String key = sb.toString();
            
            // Group the original string under its frequency signature
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        
        // Return all grouped anagrams as a list of lists
        return new ArrayList<>(map.values());
    }
    
}
