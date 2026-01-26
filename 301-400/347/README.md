# 347. Top K Frequent Elements

[LeetCode Problem Link](https://leetcode.com/problems/top-k-frequent-elements/)

## Performance

- **Runtime**: 11 ms (Beats 94.67%)
- **Memory**: 47.22 MB (Beats 96.04%)

## Complexity Analysis

- **Time Complexity**: $O(N)$, where $N$ is the number of elements in the array. We iterate through the array to count frequencies ($O(N)$), then put them into buckets ($O(N)$), and finally iterate through the buckets ($O(N)$).
- **Space Complexity**: $O(N)$, to store the frequency map and the buckets array.

## Approach

The problem asks for the $k$ most frequent elements. A standard sorting approach would take $O(N \log N)$. However, using **Bucket Sort**, we can achieve linear time complexity $O(N)$.

1.  **Frequency Map**: First, we traverse the input array `nums` and count the frequency of each element using a `HashMap`.
2.  **Bucket Sort**:
    -   We create an array of lists called `buckets`. The size of this array is `nums.length + 1` because the maximum frequency of any element cannot exceed the length of the array.
    -   The index of the `buckets` array represents the **frequency**. We iterate through the frequency map and place each element into the bucket corresponding to its frequency.
3.  **Gather Results**:
    -   We iterate through the `buckets` array from the end (highest frequency) to the beginning.
    -   We add elements from the non-empty buckets to our result array until we have collected `k` elements.
4.  **Result**: Return the array containing the top $k$ frequent elements.
