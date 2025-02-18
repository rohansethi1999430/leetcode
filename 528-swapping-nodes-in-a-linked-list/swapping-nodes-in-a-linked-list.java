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
        if (head == null || head.next == null) return head;  // Edge case: Empty or single node

        ListNode first = head, second = head, firstPrev = null, secondPrev = null;
        ListNode temp = head;
        int length = 0;

        // Find the length of the list
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        if (k > length) return head;  // Edge case: k is out of bounds

        // Find the k-th node from the beginning
        temp = head;
        for (int i = 1; i < k; i++) {
            firstPrev = temp;
            temp = temp.next;
        }
        first = temp;

        // Find the k-th node from the end (length - k + 1)
        temp = head;
        for (int i = 1; i < length - k + 1; i++) {
            secondPrev = temp;
            temp = temp.next;
        }
        second = temp;

        // If both nodes are the same, no need to swap
        if (first == second) return head;

        // Swap nodes
        if (firstPrev != null) firstPrev.next = second;
        if (secondPrev != null) secondPrev.next = first;

        // Swap next pointers
        ListNode tempNext = first.next;
        first.next = second.next;
        second.next = tempNext;

        // If swapping head node, update head
        if (first == head) return second;
        if (second == head) return first;

        return head;
    }
}