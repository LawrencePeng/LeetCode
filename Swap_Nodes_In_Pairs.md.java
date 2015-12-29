public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode ans = head;
        while(head != null) {
            if(head.next != null) {
                int tmp = head.val;
                head.val = head.next.val;
                head.next.val = tmp;
            } else break;
            head = head.next.next;
        }
        return ans;
    }
}
