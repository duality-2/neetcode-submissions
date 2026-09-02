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
  public ListNode reverseList(ListNode head) {
    // Base Case
    if (head == null || head.next == null) {
      return head;
    }

    // Recurse down to the last node
    ListNode newHead = reverseList(head.next);

    // Unwind: point the next node's next pointer back to current node
    head.next.next = head;
    head.next = null;

    return newHead;
  }

}