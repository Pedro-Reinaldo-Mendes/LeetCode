# 70. Climbing Stairs

[LeetCode Problem Link](https://leetcode.com/problems/climbing-stairs/)

## Performance

- **Runtime**: 0 ms (Beats 100.00%)
- **Memory**: 42.20 MB (Beats 45.10%)

## Complexity Analysis

- **Time Complexity**: $O(N)$, where $N$ is the number of stairs. We iterate from 3 to $N$ exactly once.
- **Space Complexity**: $O(1)$. We only use a constant number of variables (`twoStepsBeh`, `oneStepBeh`, `tNum`) to store the state of the previous steps.

## Approach

The problem asks for the number of distinct ways to climb $N$ stairs, taking 1 or 2 steps at a time. This is a classic dynamic programming problem, essentially the Fibonacci sequence.

1.  **Base Cases**:
    -   If $N=1$, there is 1 way (1 step).
    -   If $N=2$, there are 2 ways (1+1, 2).
2.  **Recurrence**: To reach step $i$, one could have come from step $i-1$ (taking 1 step) or step $i-2$ (taking 2 steps).
    -   Therefore, `ways(i) = ways(i-1) + ways(i-2)`.
3.  **Optimization**: Instead of using an array to store all previous values, we only need the last two values.
    -   `twoStepsBeh` represents `ways(i-2)`.
    -   `oneStepBeh` represents `ways(i-1)`.
4.  **Loop**: We iterate from $i=3$ to $N$, updating variables:
    -   The new number of ways is `twoStepsBeh + oneStepBeh`.
    -   We shift our window: `twoStepsBeh` becomes the old `oneStepBeh`, and `oneStepBeh` becomes the new calculated sum.
5.  **Result**: `oneStepBeh` contains the answer for $N$.
