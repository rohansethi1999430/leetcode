/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> map = new HashMap<>();
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1!=null){
            if(map.containsKey(temp1)){
                return temp1;
            }
            else {
                map.put(temp1,1);
            }
            temp1 = temp1.next;

        }

            while(temp2!=null){
            if(map.containsKey(temp2)){
                return temp2;
            }
            else {
                map.put(temp2,1);
            }
            temp2 = temp2.next;

        }
        return null;

    }
}