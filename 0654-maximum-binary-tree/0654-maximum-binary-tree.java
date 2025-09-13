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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
  return build(nums,0,nums.length-1);
        
    }

    public static int maxvalindex(int[] nums,int l,int r){
        int maxindex=l;
        for(int i=l+1;i<=r;i++){
            if(nums[maxindex]<nums[i]){
                maxindex=i;
            }
        }
        return maxindex;


    }
     private TreeNode build(int[] nums, int left, int right) {
        if (left > right) return null;

        int maxIndex = maxvalindex(nums, left, right);
        TreeNode root = new TreeNode(nums[maxIndex]);

        root.left = build(nums, left, maxIndex - 1);
        root.right = build(nums, maxIndex + 1, right);

        return root;
    }
}