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
   private TreeNode ll=null;
  
    public void flatten(TreeNode root) {

    if(root==null) return;
    flatten(root.right);
       flatten(root.left);
        
        root.right=ll;
        root.left=null;
     
       

        ll=root;

       
    }
}