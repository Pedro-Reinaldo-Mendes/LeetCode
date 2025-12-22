/**
 * 242. Valid Anagram
 * 
 * https://leetcode.com/problems/valid-anagram/description/
 */
class Solution {
    public boolean isAnagram(String s, String t) {

        // If the length of both Strings is different, they're definitely not anagrams
        // of each other
        if (s.length() != t.length())
            return false;

        // The size is 26 because we assume English lowercase letters.
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            if (count[c - 'a']-- == 0)
                return false;
        }

        return true;
    }
}