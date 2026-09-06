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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode nextv=null;
        if(head==null){
            return null;
        }
        while(curr!=null){
            nextv=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextv;
        }
        return prev;
    }
}
