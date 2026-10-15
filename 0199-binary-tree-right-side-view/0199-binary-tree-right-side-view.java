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
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer>ans=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
            int size=q.size();
                for(int i=0;i<size;i++){
                    TreeNode nd=q.remove();
                    if(nd.right!=null){
                        q.add(nd.right);
                    }
                    if(nd.left!=null){
                        q.add(nd.left);
                    }
                    if(i==0){
                        ans.add(nd.val);
                    }
                }
            
        }
return  ans;
    }
}