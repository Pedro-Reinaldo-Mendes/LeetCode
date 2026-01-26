/**
 * 15. 3Sum
 * 
 * https://leetcode.com/problems/3sum/
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Get the sorted array
        Arrays.sort(nums);

        // Create the result list
        List<List<Integer>> res = new ArrayList<>();

        // For each element, we'll find every combination
        for (int a = 0; a < nums.length && nums[a] <= 0; a++) {
            if (a != 0 && nums[a - 1] == nums[a])
                continue;
            // Calculate the other two elements target
            // int target = -nums[a]; // We can sacrifice memory using this statement and
            // get better performance
            // Pointers
            int l = a + 1;
            int r = nums.length - 1;
            while (l < r) {
                if (nums[l] + nums[r] == -nums[a]) {
                    res.add(Arrays.asList(nums[a], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1])
                        l++;
                    while (l < r && nums[r] == nums[r + 1])
                        r--;
                } else if (nums[l] + nums[r] < -nums[a]) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return res;
    }
}