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
    public List<Integer> rightSideView(TreeNode root) {
         List<Integer> val=new ArrayList<>();
        if(root==null){
            return val;
        }
       
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size=q.size();
            TreeNode right=null;

            for(int i=0;i<size;i++){
                TreeNode n=q.poll();
                right=n;
                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);

            }
            val.add(right.val);


        }

        return val;
    }
}