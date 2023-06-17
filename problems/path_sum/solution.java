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
    int target = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        target = targetSum;
        return dfs(root, 0);
    }
    public boolean dfs(TreeNode node,int sum) {
        if(node == null){
            return false;
        }
        sum+=node.val;
        if(node.left == null && node.right == null && sum==target){
            return true;
        }
        return dfs(node.left,sum) || dfs(node.right,sum);
    }
}