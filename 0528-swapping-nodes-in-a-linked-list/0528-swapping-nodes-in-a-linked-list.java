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
    public ListNode swapNodes(ListNode head, int k) {
      
        ListNode l=head;
        ListNode i=null;
         ListNode j=head;
         int c=1;

         while(l!=null){
            if(c==k){
                i=l;

            }

            l=l.next;
            c++;

         }

     int len=c-1;
    

     for (int t = 1; t <= len - k; t++) {
    j = j.next;
         }

         int temp=i.val;
         i.val=j.val;
         j.val=temp;




 return head;
    
        
    }
}