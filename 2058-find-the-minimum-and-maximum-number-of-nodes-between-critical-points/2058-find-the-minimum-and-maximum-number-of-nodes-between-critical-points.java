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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int cnt=1;
        int first=0;
        int lastvalue=head.val;
        ListNode temp=head.next;
        while(temp.next!=null){
            cnt++;
            if((temp.val<lastvalue && temp.val<temp.next.val) || (temp.val>lastvalue && temp.val>temp.next.val) ){
                first=cnt;
                lastvalue=temp.val;
                break;
            }
            lastvalue=temp.val;
            temp=temp.next;
        }
        if(temp==null || first==0)return new int[]{-1,-1};

        temp=temp.next;
        int dis=first;
        int min=Integer.MAX_VALUE;
        while(temp.next!=null){
            cnt++;
            if((temp.val<lastvalue && temp.val<temp.next.val) || (temp.val>lastvalue && temp.val>temp.next.val) ){
            min=Math.min(min,cnt-dis);
            dis=cnt;
            }
            lastvalue=temp.val;
            temp=temp.next;
        }
        if(min==Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }
        int max=dis-first;
        return new int[]{min,max};



        
    }
}