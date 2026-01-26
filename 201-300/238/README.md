# 238. Product of Array Except Self

[LeetCode Problem Link](https://leetcode.com/problems/product-of-array-except-self/)

## Performance

- **Runtime**: 2 ms (Beats 94.29%)
- **Memory**: 72.43 MB (Beats 11.95%)

## Complexity Analysis

- **Time Complexity**: $O(N)$, where $N$ is the length of the array. We take two passes through the array.
- **Space Complexity**: $O(1)$, excluding the output array. We use a single variable `productCounter` for the suffix product calculation.

## Approach

The problem requires calculating an output array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`. We must solve it without division and in $O(N)$ time.

1.  **Prefix Products**: First, we initialize the result array `res`. We perform a forward pass to calculate the prefix products. `res[i]` will store the product of all elements to the left of index `i`.
    -   `res[0]` is initialized to 1.
    -   For `i` from 1 to `N-1`, `res[i] = res[i-1] * nums[i-1]`.
2.  **Suffix Products**: Instead of storing suffix products in a separate array (which would increase space complexity), we calculate them on the fly during a backward pass.
    -   We maintain a `productCounter` variable, initialized to 1.
    -   We iterate backwards from `N-1` down to 0.
    -   For each index `i`, we update `res[i]` by multiplying it with `productCounter` (which represents the product of all elements to the right of `i`).
    -   We then update `productCounter` by multiplying it with `nums[i]`.
3.  **Result**: The `res` array now contains the product of all elements except self.
