import java.util.HashSet;

/**
 * 217. Contains Duplicate
 *
 * @see <a href="https://leetcode.com/problems/contains-duplicate/">Contains
 *      Duplicate</a>
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashSet = new HashSet<>(); // If we want to save some memory, we can put as the initial size of our
                                                // Set nums.length by using "new HashSet<>(nums.length)"

        for (int num : nums) {
            if (!hashSet.add(num))
                return true;
        }

        return false;
    }
}