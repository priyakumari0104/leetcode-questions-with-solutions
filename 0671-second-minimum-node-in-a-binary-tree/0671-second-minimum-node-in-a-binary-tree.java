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
    long min=Long.MAX_VALUE;
    long secmin= Long.MAX_VALUE;
    public  void dfs(TreeNode node){
        if(node==null){
            return ;
        }
        if(node.val<min){
            secmin=min;
            min=node.val;
        }else if(node.val<secmin&& node.val!=min){
            secmin=node.val;
        }
        dfs(node.left);
        dfs(node.right);
    }
    public int findSecondMinimumValue(TreeNode root) {
        
        dfs(root);
        if(secmin==Long.MAX_VALUE){
            return -1;
        }
        return (int)secmin;
        
    }


}