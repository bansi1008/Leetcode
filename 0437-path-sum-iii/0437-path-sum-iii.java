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
    private int c = 0;
    public void path(int remain,TreeNode node,List<Integer> pathh){
        if(node==null) return;
        pathh.add(node.val);
        
            long sum = 0;
            for (int i = pathh.size() - 1; i >= 0; i--) {
           sum +=(long) pathh.get(i);
           if (sum ==(long) remain) {
            c++;  
           }
            }
          

       
            path(remain,node.left,pathh);
            path(remain,node.right,pathh);

        
        pathh.remove( pathh.size() -1);
    }
    public int pathSum(TreeNode root, int targetSum) {
       

        path(targetSum, root,new ArrayList<>());
        
        return c;

    }
}