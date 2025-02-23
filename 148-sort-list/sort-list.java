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
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer>arr = new ArrayList<>();

        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }
        arr.sort(Comparator.naturalOrder());
        if(arr.size()>0){
        ListNode newhead = new ListNode(arr.get(0));
        ListNode temp2 = newhead;
        for(int i = 1;i<arr.size();i++){
            ListNode newtemp = new ListNode(arr.get(i));
            temp2.next = newtemp;
            temp2 = temp2.next;

        } 
        return newhead;
        }
        return null;

    }
    
}