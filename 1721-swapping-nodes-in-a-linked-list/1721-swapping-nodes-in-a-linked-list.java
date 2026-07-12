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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int endl=size-k;
        temp=head;
        ListNode a=new ListNode(-1);
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
     a=temp;
     ListNode b=new ListNode(-1);
     temp=head;
     for(int i=1;i<=endl;i++){
temp=temp.next;
     }
b=temp;
ListNode x= new ListNode(-1);
x.val=a.val;
a.val=b.val;
b.val=x.val;
return head;
    }
}