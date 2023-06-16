/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode tail = head;
		List<Integer> arr = new ArrayList<>();
		while (tail != null) {
			arr.add(tail.val);
			tail = tail.next;
		}
		int n = arr.size();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n / 2; i++) {
			int s = arr.get(i) + arr.get(n - 1 - i);
			// System.out.println(s);
			max = Math.max(max, s);
		}
        return max;
    }
}