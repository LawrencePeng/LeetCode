/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode n1 = l1;
        ListNode n2 = l2;

        ListNode sum = null;
        ListNode head = null;

        boolean adv = false;

        while (n1 != null && n2 != null) {
            int tmp = n1.val + n2.val + (adv ? 1 : 0);
            if (tmp >= 10) {
                tmp -= 10;
                adv = true;
            } else {
                adv = false;
            }

            if (sum == null) {
                sum = new ListNode(tmp);
                head = sum;
            } else {
                ListNode tmpNode = new ListNode(tmp);
                sum.next = tmpNode;
                sum = sum.next;
            }

            n1 = n1.next;
            n2 = n2.next;
        }

        while (n1 != null) {
            int advInt = adv ? 1 : 0;
            int tmp = n1.val + advInt;
            if (tmp >= 10) {
                tmp -= 10;
                adv = true;
            } else {
                adv = false;
            }
            ListNode tmpNode = new ListNode(tmp);
            sum.next = tmpNode;
            sum = sum.next;
            n1 = n1.next;
        }

        while (n2 != null) {
            int advInt = adv ? 1 : 0;
            int tmp = n2.val + advInt;
            if (tmp >= 10) {
                tmp -= 10;
                adv = true;
            } else {
                adv = false;
            }
            ListNode tmpNode = new ListNode(tmp);
            sum.next = tmpNode;
            sum = sum.next;
            n2 = n2.next;
        }

        if (adv) {
            ListNode tmpNode = new ListNode(1);
            sum.next = tmpNode;
        }

        return head;
    }

    private ListNode reverseList(ListNode head) {
        ListNode last = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = last;
            last = head;
            head = tmp;
        }
        return last;
}
}
