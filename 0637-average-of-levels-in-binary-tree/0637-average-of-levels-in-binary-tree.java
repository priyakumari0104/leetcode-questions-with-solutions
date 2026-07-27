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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> que= new LinkedList<>();
        que.add(root);
        
        List<Double> ans= new ArrayList<>();
        while(!que.isEmpty()){
            Double sum=0.0;
            int node=0;
            Queue<TreeNode> temp=new LinkedList<>();
            while(!que.isEmpty()){
                
               TreeNode res=que.poll();
                sum+=res.val;
                node++;
                if(res.left!=null){
                    temp.add(res.left);
                }if(res.right!=null){
                    temp.add(res.right);
                }
            }
            que=temp;
            ans.add(sum/node);
        }
        return ans;
    }
}