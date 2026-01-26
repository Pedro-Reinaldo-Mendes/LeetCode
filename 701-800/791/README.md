# 791. Custom Sort String

[LeetCode Problem Link](https://leetcode.com/problems/custom-sort-string/)

## Performance

- **Runtime**: 4 ms (Beats 24.16%)
- **Memory**: 43.10 MB (Beats 44.69%)

## Complexity Analysis

- **Time Complexity**: $O(N \log N)$, where $N$ is the length of string `s`. Sorting the character array dominates the complexity. Note that the problem constraints typically allow for linear time solutions ($O(N + M)$ where $M$ is `order` length) using frequency maps, but the current implementation uses a custom comparator sort.
- **Space Complexity**: $O(N)$ to store the `Character` array and `StringBuilder`.

## Approach

The problem asks to permute the characters of `s` so that they match the order that characters appear in `order`.

1.  **Priority Map**: We create an integer array `pMap` of size 26 to store a "priority" value for each character found in `order`.
    -   Characters appearing earlier in `order` are given higher priority values. For example, if `order` is "cba", 'c' might get 3, 'b' 2, 'a' 1.
    -   Characters not in `order` remain at the default priority 0.
2.  **Custom Sort**:
    -   We convert `s` into a `Character` object array (since `Arrays.sort` with a comparator requires objects).
    -   We sort this array using a custom comparator. The comparator treats characters with higher priority values as "smaller" (appearing earlier). specifically, `compare(c1, c2)` returns `pMap[c2] - pMap[c1]`.
3.  **Build Result**: Finally, we reconstruct the string from the sorted characters.
