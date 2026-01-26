/**
 * 238. Product of Array Except Self
 * 
 * https://leetcode.com/problems/product-of-array-except-self/
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Create the result array
        int[] res = new int[nums.length];

        // Add the product of numbers behind
        res[0] = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            res[i + 1] = res[i] * nums[i];
        }

        // Multiply by the product of numbers after
        int productCounter = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            productCounter *= nums[i];
            res[i - 1] *= productCounter;
        }

        return res;
    }
}