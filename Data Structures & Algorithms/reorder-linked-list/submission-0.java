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
    public void reorderList(ListNode head) {
      ListNode s=head;
      ListNode f=head;
      while(f!=null && f.next!=null){
        s=s.next;
        f=f.next.next;
      }
      ListNode k=s.next;
      s.next=null;
      ListNode prev=null;
      ListNode curr=k;
      ListNode n=null;
      while(curr!=null){
        n=curr.next;
        curr.next=prev;
        prev=curr;
        curr=n;
      }
      ListNode p=head.next;
      ListNode b=head;
      ListNode h=b;
      int i=1;int j=0;
      while(p!=null && prev!=null){
        if(i>j){
            b.next=prev;
            b=prev;
            prev=prev.next;j++;
        }
        else{
            b.next=p;
            b=p;
            p=p.next;i++;
        }
      }
      while(p!=null){
        b.next=p;
        b=p;
        p=p.next;
      }
      while(prev!=null){
        b.next=prev;
        b=prev;
        prev=prev.next;
      }
      while(h!=null){
        System.out.print(h.val);
        h=h.next;
      }
    }
}
