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
    public ListNode modifiedList(int[] nums, ListNode head) {

        Map<Integer,Integer> freq=new HashMap<>();

        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

ListNode d = new ListNode(0, head);
ListNode l=d;
ListNode c=head;

    
    while(c!=null){
        if(freq.containsKey(c.val)){
           l.next=c.next;

        }
        else{
            l=c;
        }

        c=c.next;
    }
     return d.next;
    }
}