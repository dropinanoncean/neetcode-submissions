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
        ListNode dummy = new ListNode(0,head);
        //Two pointers
        ListNode left = dummy;
        ListNode right =  head;
        
        //shift right pointer by n
        for(int i = 1; i<=n; i++){
            right = right.next;
        }
        
        //move both pointer until right is at the end
        while(right != null){
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return dummy.next;

    }
}
