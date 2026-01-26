# 15. 3Sum

[LeetCode Problem Link](https://leetcode.com/problems/3sum/)

## Performance

- **Runtime**: 29 ms (Beats 91.31%)
- **Memory**: 59.38 MB (Beats 41.06%)

## Complexity Analysis

- **Time Complexity**: $O(N^2)$, where $N$ is the number of elements in the array. We sort the array ($O(N \log N)$) and then iterate through it, using two pointers for each element ($O(N^2)$).
- **Space Complexity**: $O(1)$ (or $O(N)$ depending on sorting implementation) for storing the result and sorting, disregarding the output list.

## Approach

The problem asks for unique triplets that sum to zero.

1.  **Sort the Array**: First, we sort `nums`. This allows us to use the two-pointer technique and easily skip duplicates.
2.  **Iterate**: We loop through the array with index `a`. Since we want $nums[a] + nums[l] + nums[r] = 0$, `nums[a]` acts as the fixed pivot.
    -   If `nums[a] > 0`, we break early because subsequent numbers will also be positive, making the sum > 0.
    -   We skip duplicate values of `nums[a]` to avoid duplicate triplets.
3.  **Two Pointers**: We set `l = a + 1` and `r = nums.length - 1`.
    -   We calculate the sum of `nums[a] + nums[l] + nums[r]`.
    -   If the sum is **0**, we add the triplet to the result. Then, we move `l` right and `r` left, skipping any duplicate values for `nums[l]` and `nums[r]` to ensure uniqueness.
    -   If the sum is **less than 0**, we need a larger sum, so we increment `l`.
    -   If the sum is **greater than 0**, we need a smaller sum, so we decrement `r`.
