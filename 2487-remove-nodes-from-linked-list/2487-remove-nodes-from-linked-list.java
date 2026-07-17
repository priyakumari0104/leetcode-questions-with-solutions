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
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;
        Stack<Integer> st = new Stack<>();
        while (temp != null) {
            if (st.isEmpty()) {
                st.push(temp.val);
            } else {
                while (st.size() > 0&& st.peek()<temp.val) {
                        st.pop();
                }
                 st.push(temp.val);
            }
            temp=temp.next;
        }
        ListNode curr = null;
        ;
        while (st.size() > 0) {
            ListNode tt = new ListNode(st.peek());
            tt.next = curr;
            curr = tt;

            st.pop();
        }
        return curr;
    }
}