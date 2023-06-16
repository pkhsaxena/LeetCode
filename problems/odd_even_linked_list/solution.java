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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
			return head;
		}
		ListNode evenHead = head.next, evenTail = head.next, oddTail = head;
		int i = 3;
		ListNode current = head.next.next;
		while (current != null) {
			ListNode next = current.next;
			// System.out.println(current.val);
			if (i % 2 == 0) {
				current = next;
				// ListNode c = head;
				// while (c != null) {
				// 	System.out.print(c.val + ",");
				// 	c = c.next;
				// }
				// System.out.println();
			} else {
				oddTail.next = current;
				evenTail.next = next;
                evenTail = evenTail.next;
				oddTail = oddTail.next;
				oddTail.next = evenHead;
				// ListNode c = head;
				// while (c != null) {
				// 	System.out.print(c.val + ",");
				// 	c = c.next;
				// }
				// System.out.println();
				current = next;

			}
			i++;
		}
		return head;
    }
}