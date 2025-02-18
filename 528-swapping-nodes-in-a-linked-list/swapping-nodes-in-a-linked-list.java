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
        if (head == null || head.next == null) return head; // Edge case: empty or single node list

        ListNode start = head;
        ListNode swap1 = null, prev1 = null;
        ListNode swap2 = null, prev2 = null;
        ListNode temp;
        int counter = 1;
        int len = 0;

        // First pass: Find swap1 (k-th node from start) and calculate the length of the list
        ListNode curr = head;
        while (curr != null) {
            if (counter == k) {
                swap1 = curr;
            }
            if (counter == k - 1) {
                prev1 = curr;
            }
            curr = curr.next;
            counter++;
        }
        len = counter - 1; // Corrected length calculation

        // Second pass: Find swap2 (k-th node from end)
        counter = 1;
        curr = head;
        while (curr != null) {
            if (counter == len - k + 1) {
                swap2 = curr;
            }
            if (counter == (len - k)) {
                prev2 = curr;
            }
            curr = curr.next;
            counter++;
        }

        // If both nodes are the same, no swap needed
        if (swap1 == swap2) {
            return head;
        }

        // If k = 1 or k = length, we are swapping the first or last element
        if (prev1 == null) { // swap1 is head
            head = swap2;
        }
        if (prev2 == null) { // swap2 is head
            head = swap1;
        }

        // Case: If swap1 and swap2 are adjacent
        if (swap1.next == swap2) {
            if (prev1 != null) prev1.next = swap2;
            swap1.next = swap2.next;
            swap2.next = swap1;
            return head;
        }
        if (swap2.next == swap1) {
            if (prev2 != null) prev2.next = swap1;
            swap2.next = swap1.next;
            swap1.next = swap2;
            return head;
        }

        // General Case: Swapping non-adjacent nodes
        if (prev1 != null) prev1.next = swap2;
        if (prev2 != null) prev2.next = swap1;
        
        temp = swap1.next;
        swap1.next = swap2.next;
        swap2.next = temp;

        return head;
    }
}