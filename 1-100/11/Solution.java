
/**
 * 11. Container With Most Water
 * 
 * https://leetcode.com/problems/container-with-most-water/
 */
class Solution {
    public int maxArea(int[] height) {
        // We create the result variable
        int maxArea = 0;
        
        // We set our pointers
        int l = 0;
        int r = height.length - 1;

        // We calculate the maximum possible area for each possible width
        while (l != r) {
            int width = r - l;
            int bottleneck = (height[l] < height[r]) ? height[l++] : height[r--];
            maxArea = Math.max(width * bottleneck, maxArea);
        }

        return maxArea;
    }
}