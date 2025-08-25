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
    List<Integer> res = new ArrayList<>();

    public void preorder(TreeNode n){
        
        if (n == null) return;
        res.add(n.val);
        preorder(n.left);
        preorder(n.right);

    }
    public List<Integer> preorderTraversal(TreeNode root) {
        
       
             preorder(root);
             return res;




        
    }
}