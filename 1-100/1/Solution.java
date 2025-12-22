import java.util.HashMap;

/**
 * 1. Two Sum
 *
 * @see <a href="https://leetcode.com/problems/two-sum/">Two Sum</a>
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(target - nums[i]))
                return new int[] { hashmap.get(target - nums[i]), i };
            hashmap.put(nums[i], i);
        }

        return new int[] {};
    }
}