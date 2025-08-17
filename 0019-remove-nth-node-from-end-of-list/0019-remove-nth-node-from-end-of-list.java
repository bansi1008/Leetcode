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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l=head;
        ListNode em=null;
        int c=0;

        if(l.next==null){
            return em;  
        }

        
        while(l!=null){
            
            c++;
            l=l.next;
        }

        if(n==c){
            head=head.next;
            return head;
        }

        ListNode h=head;
      
      
       for(int i=0;i<c-n-1;i++){
        h=h.next;
        
       }
        h.next=h.next.next;

        


        return head; 
         
    }

}
