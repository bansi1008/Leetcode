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

    public void path(List<List<Integer>> res,TreeNode node,int rem,List<Integer> pathh){
        if(node==null) return;
        pathh.add(node.val);

        if(node.left == null && node.right == null && rem == node.val){
            res.add(new ArrayList<>(pathh));
        }
        else{
            path(res,node.left,rem-node.val,pathh);
             path(res,node.right,rem-node.val,pathh);
        }
        pathh.remove(pathh.size()-1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();

        path( res, root, targetSum,new ArrayList<>());
        return res;
    }
}