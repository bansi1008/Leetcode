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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode d=l3;
        int num1=0;
        while(l1!=null || l2!=null ||num1!=0 ){
            int s=num1;

            if(l1!=null){
                s+=l1.val;
                l1=l1.next;
            }
             if(l2!=null){
                s+=l2.val;
                l2=l2.next;
            }
            num1=s/10;
            d.next=new ListNode(s%10);
            d=d.next;
             
        }

   

           return l3.next;
        
        
    }
}