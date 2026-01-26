# 49. Group Anagrams

[LeetCode Problem Link](https://leetcode.com/problems/group-anagrams/)

## Performance

- **Runtime**: 6 ms (Beats 99.26%)
- **Memory**: 49.50 MB (Beats 89.42%)

## Complexity Analysis

- **Time Complexity**: $O(N \cdot K)$, where $N$ is the number of strings and $K$ is the maximum length of a string. We iterate through each string, count its characters (O(K)), and generate a key (O(K)).
- **Space Complexity**: $O(N \cdot K)$, to store the grouping of strings in the map.

## Approach

The problem asks to group anagrams together. Anagrams are strings that have the same characters with the same frequencies.

1.  **Map for Grouping**: We use a `HashMap` where the key represents the character count of a string, and the value is a list of strings that share that character count (i.e., are anagrams).
2.  **Character Count Key**: For each string in the input array:
    -   We create a character count array of size 26 (for lowercase English letters).
    -   We iterate through the string to populate the count array.
    -   We convert this count array into a unique string representation (e.g., using `String.valueOf(char[])`). This string serves as the key in our map. Two strings are anagrams if and only if they produce the same count array (and thus the same key).
3.  **Grouping**: We add the original string to the list corresponding to its key in the map.
4.  **Result**: Finally, we return the values of the map, which contains the grouped anagrams.
