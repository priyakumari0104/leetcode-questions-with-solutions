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
    class Pair{
        TreeNode node;
        long min;
        long max;
        Pair(TreeNode node,long min,long max){
            this.node=node;
            this.min=min;
            this.max=max;
        }
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
       Queue<Pair>q=new LinkedList<>();
       q.add(new Pair(root,Long.MIN_VALUE,Long.MAX_VALUE));
       while(q.size()!=0){
           int size=q.size();
           for(int i=0;i<size;i++){
           Pair p=q.remove();
           TreeNode nd=p.node;
           if(nd.left!=null){
            if(nd.left.val<=p.min||nd.left.val>=nd.val){
                return false;
            }
            q.add(new Pair(nd.left,p.min,nd.val));
           }
           if(nd.right!=null){
            if(nd.right.val<=nd.val||nd.right.val>=p.max){
                return false;
            }
            q.add(new Pair(nd.right,nd.val,p.max));
           }
           }

       }
return true;
    }
}