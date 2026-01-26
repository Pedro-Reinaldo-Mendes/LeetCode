# 206. Reverse Linked List

[LeetCode Problem Link](https://leetcode.com/problems/reverse-linked-list/)

## Performance

- **Runtime**: 0 ms (Beats 100.00%)
- **Memory**: 44.28 MB (Beats 58.96%)

## Complexity Analysis

- **Time Complexity**: $O(N)$, where $N$ is the number of nodes in the list. We traverse the original list once.
- **Space Complexity**: $O(N)$. This solution creates a new, reversed linked list rather than reversing the pointers in-place, thus consuming space proportional to the input size.

## Approach

The problem asks to reverse a singly linked list.

1.  **Iteration**: We iterate through the original list using a `cursor`.
2.  **Building New List**: For each node encountered, we create a new `ListNode`.
    -   The value of the new node is the `cursor`'s value.
    -   The `next` pointer of the new node points to the previously created node (`pNode`). This effectively prepends the new node to the result list, building it in reverse order.
3.  **Result**: The last node created becomes the head of the new reversed list.
