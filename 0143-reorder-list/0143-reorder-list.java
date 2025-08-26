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
    public void reorderList(ListNode head) {
       
        ListNode f=head;
        ListNode s=head;
    while(f!=null&&f.next!=null){
        f=f.next.next;
        s=s.next;
        
        
    }
    ListNode prev=null;
    while(s!=null){
        ListNode next=s.next;
        s.next=prev;
        prev=s;
        s=next;
    }
  
ListNode first=head;
ListNode sec=prev;
ListNode t1=null;
ListNode t2=null;
while(sec!=null){
    t1 = first.next;
    t2 = sec.next;
    first.next = sec;
    sec.next = t1;
    first = t1;
    sec = t2;

}
if (first != null) {
    first.next = null;
}

        
    }
}