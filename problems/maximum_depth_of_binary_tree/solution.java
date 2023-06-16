/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return rec(root);
    }
    public int rec(TreeNode root){
        if(root == null){
            return 0;
        }
        int left=0, right=0;
        left = 1+rec(root.left);
        right = 1+rec(root.right);
        // System.out.println("left: "+left+" right: "+right);
        return Math.max(left, right);
    }
}