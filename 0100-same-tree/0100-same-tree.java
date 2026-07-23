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
    public boolean isSameTree(TreeNode p, TreeNode m) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(p);
        q.add(m);

        while (q.size() > 0) {
            TreeNode first = q.poll();
            TreeNode seond = q.poll();
            if (first == null && seond == null) {
                continue;
            } else if (first == null || seond == null || first.val != seond.val) {
                return false;
            }
            q.add(first.left);
            q.add(seond.left);
            q.add(first.right);
            q.add(seond.right);
        }
        return true;
    }
}