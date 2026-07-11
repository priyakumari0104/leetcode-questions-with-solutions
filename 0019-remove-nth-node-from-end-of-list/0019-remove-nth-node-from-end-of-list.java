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
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(size==1){
            return null;
        }else if(size==n){
                   head=head.next;
                   return head;
        }
        int nd=size-n;
        temp=head;
        ListNode prev=head;
        for(int i=0;i<nd;i++ ){
            prev=temp;
            temp=temp.next;
        }prev.next=temp.next;
        return head;
    }
}