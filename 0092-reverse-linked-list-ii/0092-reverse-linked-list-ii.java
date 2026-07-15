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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        Stack <Integer> newstack=new Stack<>();
        ListNode temp=head;
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        for(int i=1;i<left;i++){
            prev=temp;
            temp=temp.next;
        }
        for(int i=left;i<=right;i++){
            newstack.push(temp.val);
            temp=temp.next;
        }
        while(!newstack.isEmpty()){
              prev.next=new ListNode(newstack.pop());
              prev=prev.next;
        }
        prev.next=temp;
        return dummy.next;
    }
}