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
class Solution {
    public boolean isPalindrome(ListNode head) {

        ListNode l1=head;
        ListNode l2=head;
        



       
        while(l1!=null && l1.next!=null){
            l2=l2.next;
            l1=l1.next.next;
            

        }
        ListNode prev=null;
        while(l2!=null){
             ListNode nt = l2.next;
             l2.next=prev;
             prev=l2;
             l2=nt;

        }
 ListNode left = head;
        ListNode right = prev;

        while(right!=null){
            if(left.val!=right.val){
                return false;
            }
            right=right.next;
            left=left.next;


        }
return true;


        
    }
}