/**
 * 791. Custom Sort String
 * 
 * https://leetcode.com/problems/custom-sort-string/
 */
class Solution {
    public String customSortString(String order, String s) {
        // Create a priority map
        int[] pMap = new int[26]; // Lowercase english letters

        // Fill the priority map
        for (int i = 0; i < order.length(); i++) {
            pMap[order.charAt(i) - 'a'] = order.length() - i;
        }

        // Convert s in char[]
        Character[] chars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        Arrays.sort(chars, (c1, c2) -> {
            return pMap[c2 - 'a'] - pMap[c1 - 'a'];
        });

        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }

        return sb.toString();
    }
}