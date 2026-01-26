/**
 * 70. Climbing Stairs
 * 
 * https://leetcode.com/problems/climbing-stairs/
 */
class Solution {
    public int climbStairs(int n) {
        // n = 4
        // 1 + 1 + 1 + 1
        // 2 + 1 + 1
        // 1 + 2 + 1
        // 1 + 1 + 2
        // 2 + 2
        // [5] <-

        // n = 5
        // 1 + 1 + 1 + 1 + 1
        // 2 + 1 + 1 + 1
        // 1 + 2 + 1 + 1
        // 1 + 1 + 2 + 1
        // 1 + 1 + 1 + 2
        // 2 + 2 + 1
        // 2 + 1 + 2
        // 1 + 2 + 2
        // [7] <-

        if (n == 1 || n == 2)
            return n;

        int twoStepsBeh = 1;
        int oneStepBeh = 2;

        for (int i = 3; i <= n; i++) {
            int tNum = oneStepBeh;
            oneStepBeh = twoStepsBeh + oneStepBeh;
            twoStepsBeh = tNum;
        }

        return oneStepBeh;
    }
}