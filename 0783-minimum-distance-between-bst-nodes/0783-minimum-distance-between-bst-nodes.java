/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDiffInBST(TreeNode root) {
        List<Integer> s=new ArrayList<>();
        s=check(root);
        int n=s.size();
        int min=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            int diff=s.get(i)-s.get(i-1);
            min=Math.min(diff,min);
        }
        return min;
    }
 public static List<Integer>check(TreeNode node){
    if(node==null){
        return new ArrayList<>();
    }
    List<Integer> l=new ArrayList<>();
    l.addAll(check(node.left));
    l.add(node.val);
    l.addAll(check(node.right));
    return l;
 }
}