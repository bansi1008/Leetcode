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
    public List<Integer> largestValues(TreeNode root) {
         List<Integer> l=new ArrayList<>();
         if(root==null){
            return l;
         }        
         Queue<TreeNode> q=new LinkedList<>();
         q.offer(root);
        
         while(!q.isEmpty()){
            int max=Integer.MIN_VALUE;
            int s=q.size();
            for(int i=0;i<s;i++){
          TreeNode n=q.poll();
          max=Math.max(max,n.val);
          if(n.left!=null){
            q.offer(n.left);
          }
          if(n.right!=null){
            q.offer(n.right);
          }

            }
            l.add(max);

         }
return l;
    }
}