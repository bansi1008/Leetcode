/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode l=head;
        ListNode h=head;

        while(h!=null&&h.next!=null){
             h=h.next.next;
           l=l.next;
            if(h==l){
                return true;
            }
          
        }
        return false;

        
    }
}