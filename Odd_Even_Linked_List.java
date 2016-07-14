/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return head;

        ListNode ret = head;
        ListNode end = head;
        int len = 1;

        while(end.next != null) {
            end = end.next;
            len++;
        }

        if (len <= 2) {
            return ret;
        }

        int time = len / 2;
        while (time != 0) {
            time--;
            ListNode nxt = head.next;
            ListNode nxxt = nxt.next;
            head.next = nxxt;
            nxt.next = null;
            end.next = nxt;
            head = head.next;
            end = end.next;
        }
        return ret;

    }

