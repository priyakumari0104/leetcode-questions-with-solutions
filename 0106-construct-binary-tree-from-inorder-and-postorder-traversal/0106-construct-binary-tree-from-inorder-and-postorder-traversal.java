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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=postorder.length;
        int instart=0;
        int inend=n-1;
        int postst=0;
        int postend=n-1;
        return solve(inorder,postorder,instart,inend,postst,postend);
    }
    public TreeNode solve(int [] inorder,int[]postorder,int instart,int inend,int postst,int postend){
        if(instart>inend||postst>postend){
            return null;
        }
        int rootval=postorder[postend];
             int i=instart;
             
             for(;i<=inend;i++){
                if(inorder[i]==rootval){
                    break;
                }
             }
             int leftsize=i-instart;
             int rightsize=inend-i;
             TreeNode root=new TreeNode(rootval);
             root.left=solve(inorder,postorder,instart,i-1,postst,postst+leftsize-1);
             root.right=solve(inorder,postorder,i+1,inend,postend-rightsize,postend-1);
return root;
             
    }
}