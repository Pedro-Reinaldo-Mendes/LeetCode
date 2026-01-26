# 36. Valid Sudoku

[LeetCode Problem Link](https://leetcode.com/problems/valid-sudoku/)

## Performance

- **Runtime**: 2 ms (Beats 66.79%)
- **Memory**: 46.59 MB (Beats 47.76%)

## Complexity Analysis

- **Time Complexity**: $O(1)$. Since the Sudoku board size is fixed at $9 \times 9$, we iterate through a fixed number of cells. In general terms of board size $N^2$, it would be $O(N^2)$.
- **Space Complexity**: $O(1)$. We use HashSets to store characters seen so far. In the worst case, we store 9 characters. In general terms, $O(N)$.

## Approach

The problem asks us to determine if a partially filled $9 \times 9$ Sudoku board is valid. A board is valid if:
1.  Each row checks out (no repeated numbers 1-9).
2.  Each column checks out.
3.  Each of the 9 sub-boxes ($3 \times 3$) checks out.

We validate these three conditions separately:

1.  **Rows**: We iterate through each row. We use a `HashSet` to keep track of the numbers seen in the current row. If we encounter a number already in the set, the board is invalid.
2.  **Columns**: We iterate through each column. Similar to rows, we use a `HashSet` to track numbers in the current column.
3.  **Sub-squares**: We iterate through the top-left cell of each $3 \times 3$ sub-square (indices `(0,0)`, `(0,3)`, `(0,6)`, `(3,0)`, ...). For each sub-square, we use a `HashSet` to check for duplicates within that $3 \times 3$ area.
