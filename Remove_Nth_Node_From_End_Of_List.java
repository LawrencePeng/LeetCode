/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode tmp = head;
        ListNode tmp2 = new ListNode(-1);
        tmp2.next = head;
        ListNode pre = tmp2;
        for(int i = 0; i < n; i ++)
            head = head.next;
        
        if(head == null) {
            ListNode next = tmp.next;

            if (next != null) {
                tmp.val = next.val;
                tmp.next = next.next;
            } else {
                pre.next = null;
            }
            return tmp2.next;
        }

        while(head != null) {
            head = head.next;
            tmp = tmp.next;
            pre = pre.next;
        }
        ListNode next = tmp.next;

        if (next != null) {
            tmp.val = next.val;
            tmp.next = next.next;
        } else {
            pre.next = null;
        }
        return tmp2.next;
    }
}
