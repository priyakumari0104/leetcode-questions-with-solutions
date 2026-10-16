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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer>ans=new ArrayList<>();
         ans=traversal(root);
         return ans.get(k-1);
    }
    public List<Integer> traversal(TreeNode root){
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer>l1=new ArrayList<>();
        l1.addAll(traversal(root.left));
        l1.add(root.val);
        l1.addAll(traversal(root.right));
        return l1;
    }
}