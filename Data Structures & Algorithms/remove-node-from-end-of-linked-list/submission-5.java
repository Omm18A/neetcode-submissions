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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode ne = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ne;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = prev;
        ListNode temp = dummy;
        for (int i = 0; i < n - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        prev = null;
        curr = dummy.next;
        while (curr != null) {
            ListNode ne = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ne;
        }
        return prev;       
    }
}
