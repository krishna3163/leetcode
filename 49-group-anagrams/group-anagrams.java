import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> ansMap = new HashMap<>();
        int[] count = new int[26];

        for (String s : strs) {
            Arrays.fill(count, 0);
            
            // count frequency of each char
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            // build a unique key from count[]
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append("#"); // separator to avoid ambiguity
                sb.append(count[i]);
            }
            String key = sb.toString();

            // add string to map
            if (!ansMap.containsKey(key)) {
                ansMap.put(key, new ArrayList<>());
            }
            ansMap.get(key).add(s);
        }

        return new ArrayList<>(ansMap.values());
    }
}
