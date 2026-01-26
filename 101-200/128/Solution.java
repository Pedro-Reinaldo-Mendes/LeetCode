/**
 * 128. Longest Consecutive Sequence
 * 
 * https://leetcode.com/problems/longest-consecutive-sequence/
 */
class Solution {
    public int longestConsecutive(int[] nums) {
        // Create the result variable
        int maxLen = 0;

        // Create the Set
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Find the beginning of sequences and its size
        for (int x : set) {
            if (set.contains(x - 1)) continue;
            int len = 1; // Have at least a sequence with length 1
            while (set.contains(x + len)) len++;
            if (len > maxLen) maxLen = len;
        }

        return maxLen;
    }
}