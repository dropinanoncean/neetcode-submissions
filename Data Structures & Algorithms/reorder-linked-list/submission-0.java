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
        //find middle
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //reverse second list
        ListNode prev = null;
        ListNode curr = slow;
        
        while(curr != null){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        
        //merge 2 lits
        ListNode list1 = head;
        ListNode list2 = prev;
        while(list2.next != null){
            ListNode tmp1 = list1.next;
            ListNode tmp2 = list2.next;
            list1.next = list2;
            list2.next = tmp1;
            list1 = tmp1;
            list2 = tmp2;
        }
    }
}
