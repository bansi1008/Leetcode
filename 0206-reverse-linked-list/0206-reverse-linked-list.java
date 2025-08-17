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
    public ListNode reverseList(ListNode head) {
        ListNode next;

        ListNode c=head;
        ListNode t=null;
        while(c!=null){
            next=c.next;
            c.next=t;
            t=c;
            c=next;
        }
       


    return t;
        
    }
}