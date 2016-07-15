/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        while (head != null && head.val == val) head = head.next;

        ListNode ret = head;
        while(head != null && head.next != null) {
            if (head.next.val == val) {
                ListNode nd = head.next;
                while (nd != null && nd.val == val) {
                    nd = nd.next;
                }
                head.next = nd;
            }
            head = head.next;
        }
        return ret;
    }
}
