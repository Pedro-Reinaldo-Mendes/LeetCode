/**
 * 226. Invert Binary Tree
 * 
 * https://leetcode.com/problems/invert-binary-tree/
 * 
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        // Let's use a recursive-function algorithm
        if (root == null)
            return null; // Base case
        TreeNode tempNode = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = tempNode;
        return root;
    }
}