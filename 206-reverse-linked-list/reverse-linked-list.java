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
            ListNode n = head;
            ListNode next;
            ListNode  prev = null;
            while(n!=null){
                    next = n.next;
                    n.next = prev;
                    prev = n;
                    n=next;
            }
        
        return prev;
    }
}