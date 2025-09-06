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
        private int maxsum = Integer.MIN_VALUE;
        public int path(TreeNode node){
            if(node==null) return 0;

            int left=Math.max(0,path(node.left));
            int right=Math.max(0,path(node.right));

            maxsum=Math.max(maxsum,node.val+left+right);
            return node.val + Math.max(left, right);
        }

    public int maxPathSum(TreeNode root) {
      path(root);
        return maxsum;
    }
}