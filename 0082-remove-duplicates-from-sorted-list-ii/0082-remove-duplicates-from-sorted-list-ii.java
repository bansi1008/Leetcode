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
    public ListNode deleteDuplicates(ListNode head) {

   
                    if (head == null) return null;
                    ListNode d=head;
                    
                    ListNode d3=new ListNode(0, head);
                    ListNode d1=d3;
                   



                    while( d!=null){
                         boolean b=false;

                        while(d.next != null && d.val==d.next.val){
                            d=d.next;
                            b=true;
                          
                        
                        }
                        if(b){
                  d1.next=d.next;
                        
                        }
                        else{
                            d1=d1.next;
                        }
                        d=d.next;
                    }

        return d3.next;
    }
}