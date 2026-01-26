/**
 * 977. Squares of a Sorted Array
 * 
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 */
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int index = nums.length - 1;

        // Pointers
        int l = 0;
        int r = res.length - 1;

        // Pointer absolute values
        int absL = Math.abs(nums[l]);
        int absR = Math.abs(nums[r]);

        while (l <= r) {
            if (l == r) {
                res[index] = absL * absL;
                break;
            }
            if (absL >= absR) {
                res[index--] = absL * absL;
                absL = Math.abs(nums[++l]);
            } else {
                res[index--] = absR * absR;
                absR = Math.abs(nums[--r]);
            }
        }

        return res;
    }
}