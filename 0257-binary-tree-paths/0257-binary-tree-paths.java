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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l1=new ArrayList<>();
        traversal(root,"",l1);
        return l1;
    }
    public void traversal(TreeNode root,String st,List<String> l1){
        if(root==null){
            return ;
        }
        if(st.length()==0){
            st=st+root.val;
        }else{
            st=st+"->"+root.val;
        }
        if(root.left==null&&root.right==null){
            l1.add(st);
        }
        traversal(root.left,st,l1);
        traversal(root.right,st,l1);
    }
}