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
        int counter = 0;
        int len = 0;
        ListNode start = head;
        ListNode prev = new ListNode(-1);
        while(head!=null){
            head = head.next;
            counter++;
        }
        len = counter;
        head = start;
        counter = 0;
        System.out.println(len-n);
        if(len==n){
            return start.next;
        }
        if(len==1){
            return null;
        }
        while(head!=null && counter!=(len-n)){
            prev = head;
            head = head.next;
            counter++;
        }

        System.out.println(head.val);
        System.out.println(prev.val);
        prev.next = head.next;

        return start;
    }
}