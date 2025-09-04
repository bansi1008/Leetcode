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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
          boolean leftToRight = true;
         Queue<TreeNode> q = new LinkedList<>();
         q.add(root);
         while(!q.isEmpty()){
            int s=q.size();
            List<Integer> l1=new ArrayList<>();
            
           
           
                for(int i=0;i<s;i++){
                TreeNode curr=q.poll();
                l1.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            if(!leftToRight){
                Collections.reverse(l1);
            }
            
            res.add(l1);
            leftToRight= !leftToRight;
            
            }
            
           
            
         
         return res;
}}