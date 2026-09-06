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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode curr1=list1;
        ListNode curr2=list2;
        ListNode l3=null;
        ListNode head=null;
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(curr1.val>curr2.val){
            l3=curr2;
            curr2=curr2.next;
            head=l3;
        }
        else if(curr1.val<curr2.val){
            l3=curr1;
            curr1=curr1.next;
            head=l3;
        }
        else{
            l3=curr1;
            head=l3;
            curr1=curr1.next;
        }
        while(curr1!=null && curr2!=null){
            if(curr1.val>curr2.val){
                l3.next=curr2;
                l3=curr2;
                curr2=curr2.next;
            }
            else if(curr1.val<curr2.val){
                l3.next=curr1;
                l3=curr1;
                curr1=curr1.next;
            }
            else{
                l3.next=curr1;
                l3=curr1;
                curr1=curr1.next;
            }
        }
        while(curr1!=null){
            l3.next=curr1;
            l3=curr1;
            curr1=curr1.next;
        }
        while(curr2!=null){
            l3.next=curr2;
            l3=curr2;
            curr2=curr2.next;
        }
        return head;
    }
}