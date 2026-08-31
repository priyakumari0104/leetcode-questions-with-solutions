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
        List<Integer> ans=new ArrayList<>();
        ListNode prev=head;
        ListNode curr=head.next;
        int j=1;
        while(curr.next!=null){
        if(prev.val>curr.val&&curr.next.val>curr.val){
            ans.add(j);
        }
        if(prev.val<curr.val&&curr.next.val<curr.val){
            ans.add(j);
        }
        j++;
        prev=curr;
        curr=curr.next;
        }
        if(ans.size()<2){
            return new int[]{-1,-1};
        }
        int mindistance=Integer.MAX_VALUE;
        for(int i=1;i<ans.size();i++){
            mindistance=Math.min(mindistance,(ans.get(i)-ans.get(i-1)));
        }
        int maxdistance=ans.get(ans.size()-1)-ans.get(0);
        return new int[]{mindistance,maxdistance};
    }
}