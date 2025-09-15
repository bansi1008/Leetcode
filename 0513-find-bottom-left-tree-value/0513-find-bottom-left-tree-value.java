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
    public int findBottomLeftValue(TreeNode root) {
        if(root==null){
            return 0;
        }
        int last=0;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
          
          last = q.peek().val;
          int size = q.size();
          for(int i=0;i<size;i++){
            TreeNode l=q.poll();
            if(l.left!=null){
                q.offer(l.left);
               

            }
             if(l.right!=null){
                q.offer(l.right);
                
            }
          }
        }

            return last;
        
    }
}