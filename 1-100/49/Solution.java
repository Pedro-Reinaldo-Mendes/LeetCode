/**
 * 49. Group Anagrams
 * 
 * https://leetcode.com/problems/group-anagrams/
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] count = new char[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            String countStr = String.valueOf(count);
            if (!map.containsKey(countStr))
                map.put(countStr, new ArrayList<String>());
            map.get(countStr).add(str);
        }
        return new ArrayList<List<String>>(map.values());
    }
}