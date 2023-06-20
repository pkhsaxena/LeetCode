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
	List<List<Integer>> paths = new ArrayList<>();

	public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
		dfs(root, 0,targetSum, new ArrayList<>());
        System.gc();
		return paths;
	}

	void dfs(TreeNode node, int sum, int target, List<Integer> run) {
		if (node == null) {
			return;
		}
		sum += node.val;
		run.add(node.val);
		if (node.left == null && node.right == null && sum == target) {
			List<Integer> path = new ArrayList<>(run);
			paths.add(path);            
		}
		dfs(node.left, sum,target, run);
		dfs(node.right, sum,target, run);
		run.remove(run.size() - 1);
	}
}