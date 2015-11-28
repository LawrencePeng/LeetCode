/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        ListNode head = l1.val<=l2.val ? l1 : l2;
        ListNode pre = head;
        ListNode curr = pre.next;
        ListNode other = l1==head ? l2 : l1;
        while(curr!=null)
            if(curr.val<=other.val) {
                pre = curr;
                curr = curr.next;
            } else {
                pre.next = other;
                pre = other;
                other = curr;
                curr = pre.next;
            }
        pre.next = other;
        return head;
    }
}
