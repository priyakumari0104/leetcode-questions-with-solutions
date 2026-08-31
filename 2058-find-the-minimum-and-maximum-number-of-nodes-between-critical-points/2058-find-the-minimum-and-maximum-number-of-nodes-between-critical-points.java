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
     ListNode prev=head;
     ListNode curr=head.next;
     int index=1;
     int prevcritical=-1;
     int firstcritical=-1;
     int mindistance=Integer.MAX_VALUE;
     while(curr.next!=null){
        boolean critical=(prev.val>curr.val&&curr.val<curr.next.val)||
        (prev.val<curr.val&&curr.val>curr.next.val);
        if(critical){
            if(firstcritical==-1){
                firstcritical=index;
            }
            if(prevcritical!=-1){
                mindistance=Math.min(
                    mindistance,
                    index-prevcritical
                );
            }
            prevcritical=index;
        }
        prev=curr;
        curr=curr.next;
        index++;
     }
     if(firstcritical==-1||firstcritical==prevcritical){
     return new int []{-1,-1};
     }
     int maxdistance=prevcritical-firstcritical;
     return new int[]{mindistance,maxdistance};
    }
}