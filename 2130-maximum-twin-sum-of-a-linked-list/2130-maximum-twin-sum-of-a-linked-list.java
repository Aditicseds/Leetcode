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
    public ListNode reverse(ListNode head){
         ListNode curr=head;
        ListNode prev=null;
        ListNode nex=null;
        while(curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        head=prev;
        return head;
    }
    public int pairSum(ListNode head) {
         ListNode slow=head;
       ListNode fast=head;
       ListNode t=head;
       while(fast.next.next!=null) {
           slow=slow.next;
           fast=fast.next.next;
       }
       ListNode temp=reverse(slow.next);
       int m=0;
       while(temp!=null){
         m=Math.max(m,temp.val+t.val)  ;
         temp=temp.next;
         t=t.next;
       }
       return m;

    }
}