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
    public ListNode deleteMiddle(ListNode head) {
        int counter = -1;
        int len = 0;
        ListNode start = head;
        int index = -1;
        ListNode prev = new ListNode(-1);
        while(head!=null){
            counter++;
            head = head.next;
        }
        len = counter+1;
        if(len%2==0){
            index = len/2;
            System.out.println(" Index = "+index);
        }
        else if(len%2!=0){
            index = len/2;
            System.out.println(" Index = "+index);
        }
        counter = -1;
        head = start;
        while(head!=null && counter!=index-1){
            
            prev = head;
            head = head.next;
            counter++;
        }
        System.out.println(prev.val);
        if(head!=null){
            System.out.println("INSIDE IF");
             prev.next = head.next;

        }
        else if (head == null){
            prev.next = null;
        }
        if(prev.val == -1){
            return null;
        }

       
        return start;
    }
}