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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        Queue <TreeNode> q=new LinkedList<>();
        List<List<Integer>> ans= new ArrayList<>();
        q.add(root);
        boolean levelod=true;
        while(!q.isEmpty()){
            int n=q.size();
            
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode ex= q.poll();
                temp.add(ex.val);
                if(ex.left!=null){
                    q.add(ex.left);
                }if(ex.right!=null){
                    q.add(ex.right);
                }
            }
            if(!levelod){
                Collections.reverse(temp);
            }
            ans.add(temp);
            levelod=!levelod;
        }
        return ans;
    }
}