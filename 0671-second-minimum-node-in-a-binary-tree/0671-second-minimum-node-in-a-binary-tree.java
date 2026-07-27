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
    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) {
            return -1;
        }
        List<Integer> s = check(root);
       Collections.sort(s);
        int min = s.get(0);
        long secmin = Long.MAX_VALUE;
        for (int i = 0; i < s.size(); i++) {
            if (min < s.get(i)) {
                secmin = Math.min(secmin, s.get(i));
            }

        }
        if (secmin == Long.MAX_VALUE) {
            return -1;
        }
        return (int)secmin;
    }

    public static List<Integer> check(TreeNode node) {
        if (node == null) {
            return new ArrayList<>();
        }
        List<Integer> l = new ArrayList<>();
        l.addAll(check(node.left));
        l.add(node.val);
        l.addAll(check(node.right));
        return l;
    }
}