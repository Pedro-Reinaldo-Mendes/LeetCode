/**
 * 347. Top K Frequent Elements
 * 
 * https://leetcode.com/problems/top-k-frequent-elements/
 */
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Create the frequencies map
        Map<Integer, Integer> map = new HashMap<>();

        // Insert every element in the map
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Sort the frequencies with bucket sort
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int x : map.keySet()) {
            int freq = map.get(x);
            if (buckets[freq] == null)
                buckets[freq] = new ArrayList<>();
            buckets[freq].add(x);
        }

        // Create the result array
        int[] res = new int[k];
        int indexCounter = 0;

        // Go backwards to find the top-k frequent elements
        // We can use 'indexCounter != k' because we're assured that only one answer exists
        for (int i = buckets.length - 1; i > 0 && indexCounter != k; i --) {
            if (buckets[i] != null) {
                for (int x : buckets[i]) {
                    res[indexCounter++] = x;
                }
            }
        }

        return res;
    }
}