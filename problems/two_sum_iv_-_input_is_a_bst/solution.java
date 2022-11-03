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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
		flatten(root, list);
        return twoSum(list,k);
         
    }
    boolean twoSum(List<Integer> list, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<list.size();i++){
            if(map.get(target - list.get(i)) != null){
                return true;
            } else {
                map.put(list.get(i),i);
            }
        }
        return false;
    }
    List<Integer> flatten(TreeNode node, List<Integer> list) {
		if (node == null) {
			return list;
		}
		list.add(node.val);
		flatten(node.left, list);
		flatten(node.right, list);
		return list;
	}
}