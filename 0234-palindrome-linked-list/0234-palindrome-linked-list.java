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
    public boolean isPalindrome(ListNode head) {
        Stack <Integer> newst=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            newst.push(temp.val);
            temp=temp.next;
        }
        ListNode list2 =new ListNode(Integer.MIN_VALUE);
        ListNode ptr=list2;
        while(!newst.isEmpty()){
            ptr.next=new ListNode(newst.pop());
            ptr=ptr.next;
        }
        temp=head;
        ptr=list2;
        while(temp!=null){
            if(temp.val==ptr.next.val){
                temp=temp.next;
                ptr=ptr.next;
            }else{
                return false;
            }
        }
        return true;
    }
}