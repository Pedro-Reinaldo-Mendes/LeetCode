# LeetCode - 217. Contains Duplicate

**Profile:** [PedroRM](https://leetcode.com/u/PedroRM/)

## Performance

- **Runtime:** 10 ms
- **Memory Usage:** 98.12 MB
- **Beats:** 98.21% (Runtime), 5.19% (Memory)

## Complexity Analysis

- **Time Complexity:** $O(n)$
  - We iterate through the array `nums` exactly once. The `add` operation in a HashSet has an average time complexity of $O(1)$.
- **Space Complexity:** $O(n)$
  - In the worst case (where there are no duplicates), the HashSet will store all $n$ unique elements from the array.

## Logic Description

To determine if any integer appears at least twice in the array, we can use a **HashSet** for efficient lookups.

1.  **Data Structure**: We utilize a `HashSet` to keep track of the unique elements we have encountered so far.

2.  **Iterate and Check**:
    - We loop through each integer `num` in the input array `nums`.
    - Inside the loop, we attempt to add the current `num` to the `hashSet` using `hashSet.add(num)`.
    - The `add` method returns `false` if the element is already present in the set. 
    - **Duplicate Found**: If `add` returns `false`, we immediately know that `num` is a duplicate, utilizing the property of the Set interface where duplicates are not allowed. We return `true`.
    - If the loop completes without finding any duplicates, we return `false`.

This approach provides a linear time complexity solution $O(n)$ compared to a brute-force $O(n^2)$ approach or an $O(n \log n)$ sorting approach.
