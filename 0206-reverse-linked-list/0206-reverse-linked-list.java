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
      if(head==null||head.next==null){
        return head;
      }
      ListNode l1= new ListNode(head.val);
      ListNode temp=head;
      temp=temp.next;
      while(temp!=null){
        ListNode prev=new ListNode(temp.val);
        prev.next=l1;
        l1=prev;
        temp=temp.next;
      }
return l1;

    }
}