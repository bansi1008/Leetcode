/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
       
       return buildtree(head,null);

        
    }
    public TreeNode buildtree(ListNode head,ListNode tail){
        if(head==tail){

           return null;
        }

         ListNode f=head;
         ListNode s=head;
         while(f!=tail && f.next!=tail){
            s=s.next;
            f=f.next.next;
         }
      TreeNode root=new TreeNode(s.val);

            root.left=buildtree(head,s);
            root.right=buildtree(s.next,tail);
          return root;
    }
}