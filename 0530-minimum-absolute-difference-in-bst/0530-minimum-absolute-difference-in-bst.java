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
    public int getMinimumDifference(TreeNode root) {
          List<Integer> s=new ArrayList<>();
       s=inorder(root);
       int n=s.size();
       int min=Integer.MAX_VALUE;
       for(int i=1;i<n;i++){
           int abs=Math.abs(s.get(i)-s.get(i-1));
           min=Math.min(abs,min);
       }return min;
    }
    public List<Integer> inorder(TreeNode node){
        if(node==null){
            return new ArrayList<>();
        }
        List<Integer>l1=new ArrayList<>();
        l1.addAll(inorder(node.left));
        l1.add(node.val);
        l1.addAll(inorder(node.right));
        return l1;
    }
}