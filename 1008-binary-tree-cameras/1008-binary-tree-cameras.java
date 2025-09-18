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
    int c=0;

    public int dfs(TreeNode node){
        if(node==null) return 2;

        int left=dfs(node.left);
        int right=dfs(node.right);

        if(left==0 || right==0){
            c++;
            return 1;
        }
        if(left==1 || right==1){
            return 2;
        }
        return 0;

    }
    public int minCameraCover(TreeNode root) {
        if(dfs(root)==0) c++;
        return c;
        
        
    }
}