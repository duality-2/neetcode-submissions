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
        int length = findLength(head);
        if(length == n) return removeHead(head);
        ListNode temp = head;
        ListNode prev = null;
        for(int i = 0; i < length-n; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        temp = prev;
        return head; 
    }
    private int findLength(ListNode head) {
        ListNode temp = head;
        int count  = 0;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    private ListNode removeHead(ListNode head) {
        return head = head.next;
    }
}
