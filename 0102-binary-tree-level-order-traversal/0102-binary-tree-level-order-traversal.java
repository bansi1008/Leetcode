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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res=new ArrayList<>();

        if(root==null){
            return res;

        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int l=q.size();
            List<Integer> l1=new ArrayList<>(); 
           for(int i=0;i<l;i++){
            TreeNode c=q.poll();
            l1.add(c.val);
            if(c.left!=null){
                q.add(c.left);
            }
            if(c.right!=null){
                q.add(c.right);
            }
            

           }
           res.add(l1);



                   }

                   return res;

   
        
    }
}