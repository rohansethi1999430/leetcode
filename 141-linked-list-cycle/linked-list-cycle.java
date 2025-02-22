/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// import java.util.HashMap;
// import java.util.Map;
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;

        Map<ListNode, Integer> map = new HashMap<>();

        while(temp!=null){

            if(map.containsKey(temp)){
                return true;
            }
            map.put(temp,1);
            temp = temp.next;

        }
        return false;
    }
}