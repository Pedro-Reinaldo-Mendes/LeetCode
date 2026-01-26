/**
 * 36. Valid Sudoku
 * 
 * https://leetcode.com/problems/valid-sudoku/
 */
class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Check rows
        for (int l = 0; l < board.length; l++) {
            Set<Character> set = new HashSet<>();
            for (char ch : board[l]) {
                if (!(ch == '.') && !set.add(ch)) return false;
            }
        }

        // Check columns
        for (int c = 0; c < board.length; c++) {
            Set<Character> set = new HashSet<>();
            for (int l = 0; l < board.length; l++) {
                if (!(board[l][c] == '.') && !set.add(board[l][c])) return false;
            }
        }

        // Check sub-squares
        for (int l = 0; l < board.length; l += 3) {
            for (int c = 0; c < board.length; c += 3) {
                Set<Character> set = new HashSet<>();
                for (int l2 = 0; l2 < 3; l2++) {
                    for (int c2 = 0; c2 < 3; c2++) {
                        if (!(board[l + l2][c + c2] == '.') && !set.add(board[l + l2][c + c2])) return false;
                    }
                }
            }
        }

        // If nothing is wrong, return true
        return true;
    }
}