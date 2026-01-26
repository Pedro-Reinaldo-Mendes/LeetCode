# 125. Valid Palindrome

[LeetCode Problem Link](https://leetcode.com/problems/valid-palindrome/)

## Performance

- **Runtime**: 2 ms (Beats 98.80%)
- **Memory**: 43.94 MB (Beats 97.60%)

## Complexity Analysis

- **Time Complexity**: $O(N)$, where $N$ is the length of the string. We iterate through the string at most once using two pointers.
- **Space Complexity**: $O(1)$. We strictly use two integer variables (`l` and `r`) for indices, so no extra space proportional to input size is needed.

## Approach

The problem asks to verify if a string is a palindrome, considering only alphanumeric characters and ignoring cases.

1.  **Two Pointers**: We use a two-pointer approach. One pointer `l` starts at the beginning (left) of the string, and the other `r` starts at the end (right).
2.  **Skipping Non-Alphanumeric**:
    -   We compare the characters at `l` and `r`.
    -   If the character at `l` is not a letter or digit, we increment `l` to skip it.
    -   If the character at `r` is not a letter or digit, we decrement `r` to skip it.
3.  **Comparison**:
    -   Once both pointers point to valid alphanumeric characters, we convert them to lowercase and compare.
    -   If they are not equal, the string is not a palindrome, and we return `false`.
    -   If they are equal, we move both pointers inward (`l++`, `r--`) and continue.
4.  **Completion**: If the loop finishes (meaning `l` >= `r`) without returning `false`, the string is a valid palindrome, so we return `true`.
