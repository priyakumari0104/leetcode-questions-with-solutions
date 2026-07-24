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
    public void traversal(TreeNode node,String str,List l1){
        if(node ==null){
            return ;
        }
        if(str.isEmpty()){
            str=str+node.val;
        }else{
            str=str+"->"+node.val;
        }
        if(node.left==null&&  node.right==null){
            l1.add(str);
        }
        traversal(node.left,str,l1);
        traversal(node.right,str,l1);
    }
}