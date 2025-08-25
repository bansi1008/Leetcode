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

   TreeNode p=null;
    public boolean inorder(TreeNode n){
        if(n==null) return true;
        if(!inorder(n.left)) return false;
        if(p!=null && n.val<=p.val) return false;
        p=n;
        return inorder(n.right);
    }
    public boolean isValidBST(TreeNode root) {
    return inorder(root);
        
    }
}