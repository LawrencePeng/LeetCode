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
        ListNode endA = headA;
        ListNode endB = headB;
        int lenA = 0;
        int lenB = 0;
        for (; endA != null; endA = endA.next, lenA++);
        for (; endB != null; endB = endB.next, lenB++);
        if (lenA - lenB > 0) {
            int diff = lenA - lenB;
            while (diff != 0) {
                headA = headA.next;
                diff--;
            }
        } else if (lenA - lenB < 0) {
            int diff = lenB - lenA;
            while (diff != 0) {
                headB = headB.next;
                diff--;
            }
        }

        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
