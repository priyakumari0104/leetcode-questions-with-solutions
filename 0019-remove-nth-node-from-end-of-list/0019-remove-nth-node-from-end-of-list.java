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
        if(head==null){
            return null;
        }
       ListNode temp=head;
       int len=0;
       while(temp!=null){
        len++;
        temp=temp.next;
       }if(len==n){
        return head.next;
       }
    
       int rem=len-n;
    
       
      
       temp=head;
       ListNode prev=temp;
      for(int i=0;i<rem;i++){
        prev=temp;
        temp=temp.next;
      }
      prev.next=prev.next.next;
      return head;
    }
}