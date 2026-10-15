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
    public boolean identical(TreeNode node,TreeNode subNode){
        if(node==null&&subNode==null){
            return true;
        }
        if(node==null||subNode==null){
            return false;
        }
        if(node.val==subNode.val){
        return identical(node.left,subNode.left)&&identical(node.right,subNode.right);
        }else{
            return false;
        }
        

    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null&&subRoot==null){
            return true;
        }
        if(root==null||subRoot==null){
            return false;
        }
        if(identical(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
}