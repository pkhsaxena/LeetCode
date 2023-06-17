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
    int count =0;
    public int goodNodes(TreeNode root) {
        if(root==null){
            return 0;
        } else if(root.right==null && root.left == null){
            return 1;
        }
        int max=root.val;
        dfs(root, max);
        return count;
    }
    public void dfs(TreeNode node,int max){
        if(node == null){
            return;
        }
        if(node.val >= max){
            count++;
        }
        max = Math.max(max, node.val);
        dfs(node.left,max);
        dfs(node.right,max);
    }
}