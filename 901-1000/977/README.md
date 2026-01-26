# 977. Squares of a Sorted Array

[LeetCode Problem Link](https://leetcode.com/problems/squares-of-a-sorted-array/)

## Performance

- **Runtime**: 1 ms (Beats 99.83%)
- **Memory**: 47.17 MB (Beats 83.05%)

## Complexity Analysis

- **Time Complexity**: $O(N)$, where $N$ is the length of the array. We use a two-pointer approach that iterates through the array exactly once.
- **Space Complexity**: $O(1)$, disregarding the space taken by the output array. We only use a few integer variables (`l`, `r`, `absL`, `absR`).

## Approach

The problem asks to return an array of the squares of each number sorted in non-decreasing order. The input array is already sorted in non-decreasing order, but it may contain negative numbers.

1.  **Two Pointers**: We recognize that the largest square values will be at the ends of the array (either the most negative number or the most positive number).
2.  **Comparison**: We initialize two pointers, `l` (left) at the start and `r` (right) at the end of the array.
3.  **Filling from the End**: We create a result array `res` of the same size. We fill this array from the end (`index = nums.length - 1`) backwards because we are finding the largest squares first.
4.  **Iteration**:
    -   We compare the absolute values of `nums[l]` and `nums[r]`.
    -   If `abs(nums[l])` is greater (or equal), its square is the current largest. We place it in `res[index]`, decrement `index`, and increment `l` to check the next number from the left.
    -   Otherwise, `abs(nums[r])` is the largest. We place its square in `res[index]`, decrement `index`, and decrement `r` to check the next number from the right.
5.  **Termination**: We repeat this until `l > r`.
