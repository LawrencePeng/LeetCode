/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    int len = 0;
    ListNode head;

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        this.head = head;
        ListNode node = head;
        while (node != null) {
            len++;
            node = node.next;
        }
    }

    /** Returns a random node's value. */
    public int getRandom() {
        int rnd = new Random().nextInt(len);
        ListNode node = head;
        while (rnd != 0) {
            rnd --;
            node = node.next;
        }
        return node.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
