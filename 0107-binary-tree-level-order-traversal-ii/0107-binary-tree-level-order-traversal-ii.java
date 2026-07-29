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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        List<List<Integer>> ans=new ArrayList<>();
        while(!q.isEmpty()){
            List<Integer> temp=new LinkedList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode ex= q.poll();
                temp.add(ex.val);
                if(ex.left!=null){
                    q.add(ex.left);
                }if(ex.right!=null){
                    q.add(ex.right);
                }
            }
            ans.add(temp);
        }
        Collections.reverse(ans);
        return ans;
    }
}